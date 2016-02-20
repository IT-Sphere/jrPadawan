package ru.itsphere.jrpadawan.clazz2;

public class FactorialUtils {

    /**
     * Считает факториал числа number.
     *
     * @param number любое число
     * @return результат
     */
    public static int calculate(int number) {
        int result;
        if (number == 1) {
            return 1;
            } else {
                result = calculate(number - 1) * number;

            }
        return result;
        }
    }

