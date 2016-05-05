package ru.itsphere.jrpadawan.loop;

/**
 * http://it-channel.ru/
 * <p>
 * Герберт Шилдт - Руководство для начинающих (5-е издание)
 * <p>
 * с. 97 - с. 122
 */
public class Loops {

    /**
     * ((a * 5) 5 раз) + ((b * 2) 10 раз)
     *
     * @param a - любое целое число
     * @param b - любое целое число
     * @return результат
     */
    public static long task1(long a, long b) {
        for (int i = 5; i > 0; i--) {
            a *= 5;
        }
        for (int i = 10; i > 0; i--) {
            b *= 2;
        }
        return a + b;
    }

    /**
     * Прибавлять к "a" "b" 12 раз.
     *
     * @param a - любое целое число
     * @param b - любое целое число
     * @return результат
     */
    public static long task2(long a, long b) {
        for (int i = 12; i > 0; i--) {
            a += b;
        }
        return a;
    }

    /**
     * Если b больше 100, то прибавлять к "а" "b" 5 раз.
     * Если b меньше 100, то отнимаем от "а" "b" 10 раз.
     * Если b равно 100, то умножаем "а" на 2 10 раз.
     *
     * @param a - любое целое число
     * @param b - любое целое число
     * @return результат
     */
    public static long task3(long a, long b) {
        if (b > 100) {
            for (int i = 5; i > 0; i--) {
                a += b;
            }
        }

        if (b < 100) {
            for (int i = 10; i > 0; i--) {
                a -= b;
            }
        }

        if (b == 100) {
            for (int i = 10; i > 0; i--) {
                a *= 2;
            }
        }
        return a;
    }

    /**
     * Узнайте что такое последовательность фибоначчи.
     * Пример 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ... .
     * Найти элемент в последовательности с индексом равным a.
     * Например если a = 4, то результат 2, если а = 5, то ресультат 3.
     *
     * @param a - индекс в последовательности
     * @return результат
     */
    public static long task4(long a) {
        int prePrevious = 0;
        int previous = 1;
        int result = 0;

        if (a == 1) return prePrevious;
        if (a == 2) return previous;

        for (int i = 2 ; i < a ; i++) {
            result = prePrevious + previous;
            prePrevious = previous;
            previous = result;
        }

        return result;

    }

    /**
     * Посчитать факториал числа a.
     * Если а = 3, то результат будет 6 (1 * 2 * 3).
     * Если а = 4, то результат будет 24 (1 * 2 * 3 * 4).
     *
     * @param a - любое целое число (больше или равно 0)
     * @return результат
     */
    public static long task5(int a) {
        int result = 1;
        for (int i = 2; i <= a; i++){
            result = result * i;
        }
        return result;
    }

}