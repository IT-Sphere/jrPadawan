package ru.itsphere.jrpadawan.loop;

/**
 * Герберт Шилдт - Руководство для начинающих (5-е издание)
 *
 * с. 97 - с. 122
 */
public class Loops {

    /**
     * ((a * 5) 5 раз) + ((b * 2) 10 раз)
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

}
