package ru.itsphere.jrpadawan.clazz;



/**
 * http://it-channel.ru/
 * <p>
 * Герберт Шилдт-Руководство для начинающих(5-е издание)
 * <p>
 * c. 123 - с. 153
 */
class PersonUsage {
    // Минимальный рост
    static final int MIN_HEIGHT = 140;
    // Максимальный возраст
    static final int MAX_AGE = 27;

    /**
     * Задача 2
     * Дописать метод, который создает объект класса Person (с любыми параметрами).
     *
     * @return объект класса Person
     */
    Object createPerson() {
        Person p1 = new Person();
        p1.height = 198;
        p1.age = 45;
        return p1;
    }

    /**
     * Задача 3
     * Дописать метод, который создает объект класса Person.
     * Его рост и возраст должны соответствовать MIN_HEIGHT и MAX_AGE.
     *
     * @return объект класса Person
     */
    Object createSuitablePerson() {
        Person p2 = new Person();
        p2.height = 140;
        p2.age = 27;
        return p2; // Дописать код сюда
    }

    /**
     * Задача 4
     * Дописать метод, который создает объект класса Person.
     * Его рост и возраст НЕ должны соответствовать MIN_HEIGHT и MAX_AGE.
     *
     * @return объект класса Person
     */
    Object createUnsuitablePerson() {
        Person p3 = new Person();
        p3.height = 130;
        p3.age = 22;
        return p3; // Дописать код сюда
    }
}
