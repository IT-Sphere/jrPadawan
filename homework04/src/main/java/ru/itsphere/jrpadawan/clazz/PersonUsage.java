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
     * Дописать метод, который создает и возвращает объект класса Person (с любыми параметрами).
     *
     * @return объект класса Person
     */
    Object createPerson() {
        return new Person();
    }

    /**
     * Задача 3
     * Дописать метод, который создает и возвращает объект класса Person.
     * Его рост и возраст должны соответствовать MIN_HEIGHT и MAX_AGE.
     *
     * @return объект класса Person
     */
    Object createSuitablePerson() {
        return new Person(160, 26);
    }

    /**
     * Задача 4
     * Дописать метод, который создает и возвращает объект класса Person.
     * Его рост и возраст НЕ должны соответствовать MIN_HEIGHT и MAX_AGE.
     *
     * @return объект класса Person
     */
    Object createUnsuitablePerson() {
        return new Person(130, 30);
    }
}
