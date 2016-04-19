package ru.itsphere.jrpadawan.mathematic;

/**
 * http://it-channel.ru/
 * <p>
 * Герберт Шилдт - Руководство для начинающих (5-е издание)
 * <p>
 * с. 54 - с. 84
 */
public class Mathematics {

    /**
     * Формула a + a - 2
     *
     * @param a - любое целое число
     * @return результат
     */
    public static int formula1(int a) {
        return a + a - 2;
    }

    /**
     * Формула a * (a + 2)
     *
     * @param a - любое целое число
     * @return результат
     */
    public static int formula2(int a) {
        return a * (a + 2);
    }

    /**
     * Формула a - (b + (3 + b) * 2)
     *
     * @param a - любое целое число
     * @param b - любое целое число
     * @return результат
     */
    public static int formula3(int a, int b) {
        return a - (b + (3 + b) * 2);
    }

    /**
     * Формула (a * a) / (b * a)
     * В этом задании у вас будет проблема с приведение типов.
     * После деления будет результат приведен к типу int и вы потеряете дробную часть.
     * Из-за этого будет ошибка.
     *
     * @param a - любое целое число (больше 0)
     * @param b - любое целое число (больше 0)
     * @return результат
     */
    public static double formula4(int a, int b) {
        return (double)(a * a) / (b * a);
    }

    /**
     * Формула b / (b * a)
     * В этом задании у вас будет проблема с приведение типов.
     * После деления будет результат приведен к типу int и вы потеряете дробную часть.
     * Из-за этого будет ошибка.
     *
     * @param a - любое целое число (больше 0)
     * @param b - любое целое число (больше 0)
     * @return результат
     */
    public static double formula5(int a, int b) {
        return (double)b / (b * a);
    }


    /**
     * Формула ((квадратный корень из (a * b)) / 5)
     *
     * @param a - любое целое число (больше или равно 0)
     * @param b - любое целое число (больше или равно 0)
     * @return результат
     */
    public static double formula6(int a, int b) {
        return Math.sqrt(a * b) / 5;
    }

    /**
     * Формула (квадратный корень из (a * a + b * b))
     *
     * @param a - любое целое число (больше или равно 0)
     * @param b - любое целое число (больше или равно 0)
     * @return результат
     */
    public static double formula7(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }

    /**
     * Формула ((Остаток от деления на 5 числа a) * (b в кубе))
     *
     * @param a - любое целое число
     * @param b - любое целое число
     * @return результат
     */
    public static double formula8(int a, double b) {
        return (a % 5) * Math.pow(b, 3);
    }

    /**
     * Формула (a в 10-й степени / Остаток от деления на 10 числа a)
     *
     * @param a - любое целое число (больше 0)
     * @return результат
     */
    public static double formula9(int a) {
        return  Math.pow(a, 10) /(a % 10);
    }
}
