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

    /**
     * Создать и вернуть массив состоящий из 5-ти элементов (1, 2, 3, 4, 5).
     *
     * @return массив
     */
    public static int[] task1() {
        return new int[]{1, 2, 3, 4, 5};
    }

    /**
     * Суммировать все числа в массиве и вернуть результат. Например, если массив такой (1, 2, 3, 4, 5), то результат
     * должен быть такой 15.
     *
     * @return сумма
     */
    public static int task2(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    /**
     * Найти и вернуть максимальный элемент в массиве. Например, если массив такой (1, 20, 13, 24, 5), то результат
     * должен быть такой 24.
     *
     * @return максимальный элемент
     */
    public static int task3(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i] > max) {
                max = array[i];
            }

        return max; // Дописать код сюда
    }

    /**
     * Вернуть длинну массива. Например, если массив такой (1, 20, 13, 24, 5), то результат должен быть такой 5.
     *
     * @return число (длинна)
     */
    public static long task4(int[] array) {
        return array.length; // Дописать код сюда
    }

    /**
     * Увеличить каждый элемент массива вдвое и вернуть это массив.
     * Например, если массив такой (1, 2, 3), то результат должен быть такой (2, 4, 6).
     *
     * @return число (длинна)
     */
    public static int[] task5(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        return array;
    }

    /**
     * Сделать из двух массивов один. Затем вернуть. Например, если первый массив такой (1, 20), а второй такой (13, 24, 5),
     * то результат должен быть такой (1, 20, 13, 24, 5).
     *
     * @return массив
     */
    public static int[] task6(int[] array1, int[] array2) {
        if (array1 == null)
            return array2;
        if (array2 == null)
            return array1;
        int[] twomassiw = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, twomassiw, 0, array1.length);
        System.arraycopy(array2, 0, twomassiw, array1.length, array2.length);
        return twomassiw;
    }

    /**
     * Создать двумерный массив. И проинициализировать его значениями как в примере.
     * Пример: [(1, 2, 1, 2), (1, 2, 1, 2), (1, 2, 1, 2)]. Затем вернуть. Не использовать циклы!
     *
     * @return массив
     */
    public static int[][] task7() {
        int[][] array = {{1, 2, 1, 2}, {1, 2, 1, 2}, {1, 2, 1, 2}};
        return array;
    }

    /**
     * Создать двумерный массив. И проинициализировать его значениями как в примере.
     * Пример: [(1, 2, 1, 2), (1, 2, 1, 2), (1, 2, 1, 2)]. Затем вернуть. Использовать циклы!
     *
     * @return массив
     */
    public static int[][] task8() {
// Не понял как это сделать
        return null; // Дописать код сюда
    }

    /**
     * Инвертировать массив и вернуть. Если был такой (1, 2, 3, 4), то должен стать такой (4, 3, 2, 1).
     * Затем вернуть массив.
     *
     * @return массив
     */
    public static long[] task9(long[] array) {
        for (int i = 0; array.length / 2 > i; i++) {
            int tmp = (int) array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;

        }
        return array;
    }

    /**
     * Отсортировать массив. Если был такой (2, 1, 4, 3), то должен стать такой (1, 2, 3, 4).
     * Затем вернуть массив.
     *
     * @return массив
     */
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
