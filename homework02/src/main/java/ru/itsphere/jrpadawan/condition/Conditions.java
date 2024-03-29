package ru.itsphere.jrpadawan.condition;

/**
 * http://it-channel.ru/
 * <p>
 * Герберт Шилдт - Руководство для начинающих (5-е издание)
 * <p>
 * с. 85 - с. 97
 */
public class Conditions {

    /**
     * Минимальное число из 3-х
     *
     * @param a - любое целое число
     * @param b - любое целое число
     * @param c - любое целое число
     * @return результат
     */
    public static int getMin(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b < c) {
                return b;
            } else {
                return c;
            }
        }
    }

    /**
     * Наибольшее число из 3-х
     *
     * @param a - любое целое число
     * @param b - любое целое число
     * @param c - любое целое число
     * @return результат
     */
    public static int getMax(int a, int b, int c) {
        return 0;// Дописать формулу сюда
    }

    /**
     * Все равны
     *
     * @param a - любое целое число
     * @param b - любое целое число
     * @param c - любое целое число
     * @return результат
     */
    public static boolean isAllEquals(int a, int b, int c) {
        if (a == b && b == c) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Все больше или равны 100
     *
     * @param a - любое целое число
     * @param b - любое целое число
     * @param c - любое целое число
     * @return результат
     */
    public static boolean isMoreThen100OrEquals(int a, int b, int c) {
        return false; // Дописать формулу сюда
    }

    /**
     * Все между 100 и 200 (включительно)
     *
     * @param a - любое целое число
     * @param b - любое целое число
     * @param c - любое целое число
     * @return результат
     */
    public static boolean isAllBetween100And200(int a, int b, int c) {
        return false; // Дописать формулу сюда
    }

    /**
     * Все не равны 100
     *
     * @param a - любое целое число
     * @param b - любое целое число
     * @param c - любое целое число
     * @return результат
     */
    public static boolean isAllNot100(int a, int b, int c) {
        return false; // Дописать формулу сюда
    }

    /**
     * Хотя бы одна сотня есть
     *
     * @param a - любое целое число
     * @param b - любое целое число
     * @param c - любое целое число
     * @return результат
     */
    public static boolean isAtLeastOne100(int a, int b, int c) {
        return false; // Дописать формулу сюда
    }
}
