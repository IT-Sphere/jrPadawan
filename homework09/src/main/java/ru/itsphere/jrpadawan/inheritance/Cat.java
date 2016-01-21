package ru.itsphere.jrpadawan.inheritance;

/**
 * Конкретный класс "кот".
 */
public class Cat extends LandAnimal {
    /**
     * Создаем экземпляр этого класса и задаем имя.
     *
     * @param name - кличка животного.
     */
    public Cat(String name) {
        // Вызываем унаследованный метод setName из класса Animal.
        // И указываем имя.
        setName(name);
        // Вызываем унаследованный метод setSpeed из класса Animal.
        // И указываем скорость.
        setSpeed(12.5);
        // Вызываем унаследованный метод setSound из класса LandAnimal.
        setSound("myau");
    }
}
