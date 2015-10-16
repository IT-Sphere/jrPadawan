package ru.itsphere.jrpadawan.loops;

/**
 * Герберт Шилдт - Руководство для начинающих (5-е издание)
 *
 * с. 97 - с. 122
 */
public class Loops {

    /**
     * ((a * 5) 15 раз) + ((b * 2) 20 раз)
     * @param a - любое целое число
     * @param b - любое целое число
     * @return результат
     */
    public static int task1(int a, int b) {
        int counterForA = 15;
        while (--counterForA > 0) {
            a *= 5;
        }

        int counterForB = 20;
        while (--counterForB > 0) {
            b *= 2;
        }

        return a + b;
    }

}
