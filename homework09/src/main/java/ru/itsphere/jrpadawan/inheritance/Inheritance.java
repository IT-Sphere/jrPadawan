package ru.itsphere.jrpadawan.inheritance;

import java.util.LinkedList;
import java.util.List;

/**
 * http://it-channel.ru/
 * <p>
 * Класс представляет собой собственную реализацию двусвязного списка.
 * <p>
 * Герберт Шилдт - Руководство для начинающих (5-е издание)
 * Дополнительное описание можно найти на форуме http://forum.it-channel.ru/viewtopic.php?f=18&t=1014
 * <p>
 * с. 241 - с. 283
 */
public class Inheritance {

    public static int ONE_HUNDRED_METERS = 100;

    public static void main(String[] args) {
        // LinkedList - это стандартный, класс входящий во встроенный фреймворк Java Collections.
        // Это аналог того, что мы писали в прошлом задании.
        // Просто создали список, который будет содержать животных.
        List<Animal> animals = new LinkedList<>();
        // Создаем кота и добавляем в список.
        // Обратите внимание, что в списке мы указали класс Animal, но вставить в список можем еще и его потомков.
        animals.add(new Cat("Tom"));
        // Создаем курицу и добавляем в список.
        animals.add(new Chicken("Ryaba"));
        // Создаем голубя и добавляем в список.
        animals.add(new Dove("Dove Sergey"));
        // Создаем медведя и добавляем в список.
        animals.add(new Bear("Vini-Puh"));
        animals.add(new Crocodile("Gosha"));
        animals.add(new Snake("Dima"));
        animals.add(new Whale("Stepan"));


        System.out.println("---- Movement Competition ---- ");
        System.out.println();
        doMovementCompetition(animals);
        System.out.println();

        System.out.println("---- Singing Competition ---- ");
        System.out.println();
        doSingingCompetition(animals);
        System.out.println();
    }

    /**
     * Метод, который имитирует соревнования по бегу на сто метров.
     * Обратите внимание на, то что в методе нигде не фигурирует название конкретных классов.
     * Это пример полиморфизма. JVM сама определяет, какой класс скрывается за Animal и она же вызывает
     * переопределенный метод move соответствующей конкретному животному.
     *
     * @param animals - список животных
     */
    private static void doMovementCompetition(List<Animal> animals) {
        for (Animal animal : animals) {
            double result = animal.move(ONE_HUNDRED_METERS);
            printResult(animal, result);
        }
    }

    private static void printResult(Animal animal, double result) {
        System.out.println(animal + " - " + String.format("%.2f", result) + "s.");
    }

    /**
     * Метод, который имитирует соревнования по пению.
     * Обратите внимание на, то что в методе нигде не фигурирует название конкретных классов.
     * Это пример полиморфизма. JVM сама определяет, какой класс скрывается за LandAnimal и она же вызывает
     * переопределенный метод vocalize соответствующей конкретному животному.
     *
     * @param animals - список животных
     */
    private static void doSingingCompetition(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof LandAnimal) {
                LandAnimal landAnimal = (LandAnimal) animal;
                System.out.println(animal + ": ");
                landAnimal.vocalize();
                System.out.println();
            }
        }
    }
}
