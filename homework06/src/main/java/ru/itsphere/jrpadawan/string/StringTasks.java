package ru.itsphere.jrpadawan.string;


import java.util.Arrays;

/**
 * http://it-channel.ru/
 * <p>
 * Герберт Шилдт - Руководство для начинающих (5-е издание)
 * <p>
 * с. 178 - с. 185
 */
public class StringTasks {

    /**
     * Создать и вернуть строку (String). Со значением "Hello world".
     *
     * @return строка
     */
    public static String task1() {
        return "Hello world";
    }

    /**
     * Склеить строку someWord (некоторое слово) и слово world, затем вернуть. Не забудь добавить пробел между ними.
     *
     * @return строка
     */
    public static String task2(String someWord) {
        return someWord + " world";
    }

    /**
     * Создать новый объект (строку). Этот объект должен иметь такое же значение, как и входящая строка в этот метод.
     * Но это должен быть отдельный объект!
     *
     * @return строка
     */
    public static String task3(String text) {
        return new String(text);
    }

    /**
     * Определить равняется ли значение переменной text значению "Stroki ne sravnivaut cherez '=='!".
     * Вернуть true или false.
     *
     * @return boolean
     */
    public static boolean task4(String text) {
        return (text.equals("Stroki ne sravnivaut cherez '=='!")); // Дописать код сюда
    }

    /**
     * Узнать и вернуть длинну входящей строки.
     *
     * @return длинна
     */
    public static int task5(String text) {
        return text.length(); // Дописать код сюда
    }

    /**
     * Вернуть 12-й (счет с нуля) символ стороки text.
     *
     * @return символ
     */
    public static char task6(String text) {
        return text.charAt(12);
    }

    /**
     * Проверить содержит ли text слово "bu-ga-ga".
     *
     * @return boolean
     */
    public static boolean task7(String text) {
        return text.contains("bu-ga-ga");
    }

    /**
     * Узнать с какого символа в text начинается подстрока "bu-ga-ga".
     *
     * @return номер начала подстроки
     */
    public static int task8(String text) {
        return text.charAt(Integer.parseInt("bu-ga-ga")); // Дописать код сюда
    }

    /**
     * Проверить содержит ли массив strings слово "bu-ga-ga".
     *
     * @return boolean
     */
    public static boolean task9(String[] strings) {

       return Arrays.asList(strings).contains("bu-ga-ga");
    }

    /**
     * Вернуть подстроку из строки text. С 3-го по 9-й символы. Счет ведется с нуля.
     *
     * @return строка
     */
    public static String task10(String text) {
        return text.substring(3, 9); // Дописать код сюда
    }

    /**
     * Понять, что входящая строка палиндром. Например "adada", "rrr" и "e343e" - палиндромы,
     * а "adadad", "rrra" и "e34e3e" - нет.
     *
     * @return boolean
     */
    public static boolean task11(String original) {
        for (int i = 0; i < original.length() / 2; ++i) {
            if (original.charAt(i) != original.charAt(original.length() - i - 1)) {
                return false; // символы не равны, не полиндром, возвращаем фальшь
        return false; // Дописать код сюда
    }
}
