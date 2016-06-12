package ru.itsphere.jrpadawan.clazz2;

public class FactorialUtils {

    /**
     * Считает факториал числа number.
     *
     * @param number любое число
     * @return результат
     */
    public static int calculate(int number) {
        if (number == 1 || number ==0){
            return 1;
        }
        return number * calculate(number - 1);
    }
}
