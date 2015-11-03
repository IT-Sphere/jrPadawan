package ru.itsphere.jrpadawan.clazz;

/**
 * Герберт Шилдт-Руководство для начинающих(5-е издание)
 * <p>
 * c. 123 - с. 153
 */
class User {
    int id;
    int age;

    User() {
    }

    User(int id, int age) {
        this.id = id;
        this.age = age;
    }

    boolean isKid() {
        return age < 18;
    }

    public boolean isOlder(int age) {
        return this.age > age;
    }
}
