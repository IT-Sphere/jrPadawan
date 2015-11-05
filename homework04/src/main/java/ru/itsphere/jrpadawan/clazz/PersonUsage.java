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

    Object createPerson() {
        return new Person(190, 20);
    }

    Object createSuitablePerson() {
        return new Person(178, 25);
    }

    Object createUnsuitablePerson() {
        return new Person(150, 28);
    }
}
