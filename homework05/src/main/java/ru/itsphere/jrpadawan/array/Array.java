package ru.itsphere.jrpadawan.array;

import java.util.Arrays;

/**
 * http://it-channel.ru/
 * <p>
 * Герберт Шилдт - Руководство для начинающих (5-е издание)
 * <p>
 * с. 155 - с. 178
 */
public class Array {

    public static int[] task1() {
        return new int[]{1, 2, 3, 4, 5};
    }

    public static int task2(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }


    public static int task3(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i] > max) {
                max = array[i];
            }

        return max; // Дописать код сюда
    }


    public static long task4(int[] array) {
        return array.length; // Дописать код сюда
    }


    public static int[] task5(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        return array;
    }


    public static int[] task6(int[] array1, int[] array2) {
        if (array1 == null)
            return array2;
        if (array2 == null)
            return array1;
        int[] twoArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, twoArray, 0, array1.length);
        System.arraycopy(array2, 0, twoArray, array1.length, array2.length);
        return twoArray;
    }


    public static int[][] task7() {
        int[][] array = {{1, 2, 1, 2}, {1, 2, 1, 2}, {1, 2, 1, 2}};
        return array;
    }

    public static int[][] task8() {
        int[][] twoA = new int[3][4];
        int j = 0;
        for (int i = 0; i < 3; i++){
            twoA[j][0] = 1;
            twoA[j][1] = 2;
            twoA[j][2] = 1;
            twoA[j][3] = 2;
            j++;
        }
        return twoA; // Дописать код сюда
    }


    public static long[] task9(long[] array) {
        for (int i = 0; array.length / 2 > i; i++) {
            long tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;

        }
        return array;
    }


    public static int[] task10(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}
