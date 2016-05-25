package ru.itsphere.jrpadawan.string;


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
        if (text.equals("Stroki ne sravnivaut cherez '=='!")) {
            return true;
        } else {
            return false;
        }
    }
    //return (text.equals ("Stroki ne sravnivaut cherez '=='!"));

    /**
     * Узнать и вернуть длинну входящей строки.
     *
     * @return длинна
     */
    public static int task5(String text) {
        return text.length();
    }

    /**
     * Вернуть 13-й (счет с нуля) символ стороки text.
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
        if (text.contains("bu-ga-ga")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Узнать с какого символа в text начинается подстрока "bu-ga-ga".
     *
     * @return номер начала подстроки
     */
    public static int task8(String text) {
        return text.indexOf("bu-ga-ga");
    }

    /**
     * Проверить содержит ли массив strings слово "bu-ga-ga".
     *
     * @return boolean
     */
    public static boolean task9(String[] strings) {
        if (strings.contains("bu-ga-ga")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Вернуть подстроку из строки text. С 4-го по 10-й символы. Счет ведется с нуля.
     *
     * @return строка
     */
    public static String task10(String text) {
        return text.substring(3,10);
    }

    /**
     * Понять, что входящая строка палиндром. Например "adada", "rrr" и "e343e" - палиндромы,
     * а "adadad", "rrra" и "e34e3e" - нет.
     *
     * @return boolean
     */
    public static boolean task11(String original) {
        return false; // Дописать код сюда
    }
}
