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

    private static Object reverse;


    public static String task1() {
        return "Hello world";
    }


    public static String task2(String someWord) {
        return someWord + " world";
    }


    public static String task3(String text) {
        return new String(text);
    }


    public static boolean task4(String text) {
        return (text.equals("Stroki ne sravnivaut cherez '=='!")); // Дописать код сюда
    }


    public static int task5(String text) {
        return text.length(); // Дописать код сюда
    }


    public static char task6(String text) {
        return text.charAt(12);
    }


    public static boolean task7(String text) {
        return text.contains("bu-ga-ga");
    }


    public static int task8(String text) {

        return text.indexOf("bu-ga-ga");
    }




    public static boolean task9(String[] strings) {

        return Arrays.asList(strings).contains("bu-ga-ga");
    }

    public static String task10(String text) {
        return text.substring(3, 9); // Дописать код сюда
    }


    public static boolean task11(String original) {
       String origin = new StringBuilder(original).reverse().toString();
       return original.equals(origin);
    }
}

