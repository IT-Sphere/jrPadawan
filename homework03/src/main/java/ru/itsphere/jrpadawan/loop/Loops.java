package ru.itsphere.jrpadawan.loop;

public class Loops {

    public static long task1(long a, long b) {
        for (int i = 5; i > 0; i--) {
            a *= 5;
        }
        for (int i = 10; i > 0; i--) {
            b *= 2;
        }
        return a + b;
    }

    public static long task2(long a, long b) {
        for (int i = 12; i > 0; i--) {
            a += b;
        }
        return a;
    }

    public static long task3(long a, long b) {
        if (b > 100) {
            for (int i = 5; i > 0; i--) {
                a += b;
            }
        }
        if (b < 100) {
            for (int i = 10; i > 0; i--) {
                a -= b;
            }
        }
        if (b == 100) {
            for (int i = 10; i > 0; i--) {
                a *= 2;
            }
        }
        return a;// Дописать формулу сюда
    }

    public static long task4(long a) {
        long a1 = 1, a2 = 1;
        int i = 3;
        if (a == 1) {
            return 0;
        }
        if (a == 2 || a == 3) {
            return 1;
        } else {
            while (i < a) {
                a = a1 + a2;
                a1 = a2;
                a2 = a;
                i++;
            }

        }
        return a;
    }
// Заглянул в твои тесты, создавал специально отдельный класс с void static main, там все работало тут почему то нет.

    public static long task5(int a) {

        int fact = a;
        if (a == 0) {
            return 1;
        } else {
            for (int i = a; i > 1; i--) {
                fact *= i - 1;
            }
        }
        return fact;
    }
}