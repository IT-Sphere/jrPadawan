package ru.itsphere.jrpadawan.array;

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
        int max = -2147483648;
        for (int number : array) {
            if (number > max)
                max = number;
        }
        return max;
    }

    /**
     * Вернуть длинну массива. Например, если массив такой (1, 20, 13, 24, 5), то результат должен быть такой 5.
     *
     * @return число (длинна)
     */
    public static long task4(int[] array) {
        return array.length;
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
        int[] resArray = new int[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            resArray[index] = array1[i];
            index++;
        }
        for (int i = 0; i < array2.length; i++) {
            resArray[index] = array2[i];
            index++;
        }
        return resArray;
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
        int[][] resArray = new int[3][4];
        for (int i = 0; i < resArray.length; i++) {
            for (int j = 0; j < resArray[i].length; j++) {
                resArray[i][j] = j % 2 + 1;
            }
        }
        return resArray;
    }

    /**
     * Инвертировать массив и вернуть. Если был такой (1, 2, 3, 4), то должен стать такой (4, 3, 2, 1).
     * Затем вернуть массив.
     *
     * @return массив
     */
    public static long[] task9(long[] array) {
        for (int i = 0; array.length / 2 > i; i++) {
            long tmp = array[i];
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
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = counter; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int tempValue = array[i];
                    array[i] = array[j];
                    array[j] = tempValue;
                }
            }
            counter++;
        }
        return array;
    }
}
