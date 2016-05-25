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
        int max = 0;
        for (int number: array) {
            if (number > max) max = number;
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
        int lengthOfResultArray = array1.length + array2.length;
        int[] resultArray = new int[lengthOfResultArray];
        for (int i = 0; i < resultArray.length; i++) {
            if (i < array1.length) {
                resultArray[i] = array1[i];
            } else {
                resultArray[i] = array2[i - array1.length];
            }

        }
        return resultArray;
    }

    /**
     * Создать двумерный массив. И проинициализировать его значениями как в примере.
     * Пример: [(1, 2, 1, 2), (1, 2, 1, 2), (1, 2, 1, 2)]. Затем вернуть. Не использовать циклы!
     *
     * @return массив
     */
    public static int[][] task7() {
        int[][] array = {{1, 2, 1, 2}, {1, 2, 1, 2}, {1, 2, 1, 2}};
        for
        return array;
    }

    /**
     * Создать двумерный массив. И проинициализировать его значениями как в примере.
     * Пример: [(1, 2, 1, 2), (1, 2, 1, 2), (1, 2, 1, 2)]. Затем вернуть. Использовать циклы!
     *
     * @return массив
     */
    public static int[][] task8() {


    }

    /**
     * Инвертировать массив и вернуть. Если был такой (1, 2, 3, 4), то должен стать такой (4, 3, 2, 1).
     * Затем вернуть массив.
     *
     * @return массив
     */
    public static long[] task9(long[] array) {


        return null;
    }

    /**
     * Отсортировать массив. Если был такой (2, 1, 4, 3), то должен стать такой (1, 2, 3, 4).
     * Затем вернуть массив.
     *
     * @return массив
     */
    public static int[] task10(int[] array) {
        return null; // Дописать код сюда
    }
}
