package ru.itsphere.jrpadawan.clazz;

/**
 * Герберт Шилдт-Руководство для начинающих(5-е издание)
 * <p>
 * c. 123 - с. 153
 */
class User {
    int height;
    int age;

    User() {
    }

    User(int height, int age) {
        this.height = height;
        this.age = age;
    }

    boolean isKid() {
        return age < 18;
    }

    boolean isOlder(int age) {
        return this.age > age;
    }

    boolean isHigher(int height) {
        return this.height > height;
    }
}
