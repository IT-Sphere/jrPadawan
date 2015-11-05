package ru.itsphere.jrpadawan.clazz;

/**
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
     * Дописать метод, который создает объект класса Person (с любыми параметрами).
     * @return объект класса Person
     */
    Object createPerson() {
        return new Person(190, 20);
    }

    /**
     * Дописать метод, который создает объект класса Person.
     * Его рост и возраст должны соответствовать MIN_HEIGHT и MAX_AGE.
     * @return объект класса Person
     */
    Object createSuitablePerson() {
        return new Person(178, 25);
    }

    /**
     * Дописать метод, который создает объект класса Person.
     * Его рост и возраст НЕ должны соответствовать MIN_HEIGHT и MAX_AGE.
     * @return объект класса Person
     */
    Object createUnsuitablePerson() {
        return new Person(150, 28);
    }

    /**
     * Дописать метод, который ИЗМЕНЯЕТ объект класса Person.
     * Метод должен сделать person НЕподходящим под критерий MIN_HEIGHT и MAX_AGE.
     * @param person - подходящий человек
     * @return объект класса Person
     */
    Object changeSuitablePerson(Person person) {
        person.age = 178;
        person.height = 30;
        return person;
    }

    /**
     * Дописать метод, который ИЗМЕНЯЕТ объект класса Person.
     * Метод должен сделать person подходящим под критерий MIN_HEIGHT и MAX_AGE.
     * @param person - неподходящий человек
     * @return объект класса Person
     */
    Object correctUnsuitablePerson(Person person) {
        person.age = 178;
        person.height = 25;
        return person;
    }
}
