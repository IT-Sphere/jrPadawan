package ru.itsphere.jrpadawan.clazz;

/**
 * Герберт Шилдт-Руководство для начинающих(5-е издание)
 * <p>
 * c. 123 - с. 153
 */
class UserUsage {
    // Минимальный рост
    static final int MIN_HEIGHT = 140;
    // Максимальный возраст
    static final int MAX_AGE = 27;

    Object createUser() {
        return new User(190, 20);
    }

    Object createSuitableUser() {
        return new User(178, 25);
    }

    Object createUnsuitableUser() {
        return new User(150, 28);
    }
}
