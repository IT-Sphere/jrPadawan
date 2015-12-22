package ru.itsphere.jrpadawan.access;

public class FactorialUtils {

    /**
     * Считает факториал числа number.
     *
     * @param number любое число
     * @return результат
     */
    public static int calculate(int number) {
        return (number < 2) ? 1 : number * calculate(number - 1);
    }
}
