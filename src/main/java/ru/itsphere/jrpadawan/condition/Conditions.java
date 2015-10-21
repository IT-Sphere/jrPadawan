package ru.itsphere.jrpadawan.condition;

/**
 * Герберт Шилдт - Руководство для начинающих (5-е издание)
 *
 * с. 85 - с. 97
 */
public class Conditions {

    /**
     * Минимальное число из 3-х
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
     * @param a - любое целое число
     * @param b - любое целое число
     * @param c - любое целое число
     * @return результат
     */
    public static int getMax(int a, int b, int c) {

        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    } // Дописать формулу сюда


    /**
     * Все равны
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
     * @param a - любое целое число
     * @param b - любое целое число
     * @param c - любое целое число
     * @return результат
     */
    public static boolean isMoreThen100OrEquals(int a, int b, int c) {
        if (a >= 100) {
            if (b >= 100) {
                if (c >= 100) {
                    return true;
                }
                else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    /**
     * Все между 100 и 200 (включительно)
     * @param a - любое целое число
     * @param b - любое целое число
     * @param c - любое целое число
     * @return результат
     */
    public static boolean isAllBetween100And200(int a, int b, int c) {
        if (a >= 100 && a <= 200) {
            if (b >= 100 && b <= 200) {
                if (c >= 100 && c <= 200) {
                    return true;
                }
                else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Все не равны 100
     * @param a - любое целое число
     * @param b - любое целое число
     * @param c - любое целое число
     * @return результат
     */
    public static boolean isAllNot100(int a, int b, int c) {
        if (a != 100) {
            if (b != 100) {
                if (c != 100) {
                    return true;
                }
                else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Хотябы одна сотня есть
     * @param a - любое целое число
     * @param b - любое целое число
     * @param c - любое целое число
     * @return результат
     */
    public static boolean isAtLeastOne100(int a, int b, int c) {
        if (a == 100) {
            return true;
        }
        else {if (b == 100) {
            return true;
        }
        else {if (c == 100) {
            return true;
        }
        else {
            return false;
        }
        }
        }
    }
}
