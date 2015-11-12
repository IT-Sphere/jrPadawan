package ru.itsphere.jrpadawan.loop;

/**
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
        for (int i = 0; i < 12; a += b) {
            i++;
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
            int i;
            i = 5;
            while (i > 0) {
                a += b;
                i--;
            }
        } else {
            if (b < 100) {
                int i;
                i = 10;
                while (i > 0) {
                    a -= b;
                    i--;
                }
            } else {
                int i;
                i = 10;
                while (i > 0) {
                    a *= 2;
                    i--;
                }
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
        if (a < 4) {
            if (a < 2) {
                return 0;
            } else {
                return 1;
            }
        } else {
            int b = 0, c = 1, fib = 0;
            while (a > 2) {
                fib = b + c;
                b = c;
                c = fib;
                a--;
            }
            return fib;
        }
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
        int fack = 1;
        while (a > 0) {
            fack *= a;
            a--;
        }
        a = fack;
        return a;
    }
}