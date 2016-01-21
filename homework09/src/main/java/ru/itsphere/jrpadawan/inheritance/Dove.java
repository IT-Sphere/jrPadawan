package ru.itsphere.jrpadawan.inheritance;

/**
 * Конкретный класс "голубь".
 */
public class Dove extends Bird {
    /**
     * Создаем экземпляр этого класса и задаем имя.
     *
     * @param name - кличка животного.
     */
    public Dove(String name) {
        // Вызываем унаследованный метод setName из класса Animal.
        // И указываем имя.
        setName(name);
        // Вызываем унаследованный метод setSpeed из класса Animal.
        // И указываем скорость.
        setSpeed(0.5);
        // Вызываем унаследованный метод setFlightSpeed из класса Bird.
        setFlightSpeed(27.7);
        // Вызываем унаследованный метод setSound из класса LandAnimal.
        setSound("kurli");
    }
}
