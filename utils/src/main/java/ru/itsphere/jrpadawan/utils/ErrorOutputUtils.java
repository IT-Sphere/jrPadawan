package ru.itsphere.jrpadawan.utils;

import java.util.List;

public class ErrorOutputUtils {
    public static void println(List<String> messages) {
        messages.forEach(System.out::println);
    }
}
