package ru.itsphere.jrpadawan.inheritance;

/**
 * Конкретный класс "курица".
 */
public class Chicken extends Bird {
    /**
     * Создаем экземпляр этого класса и задаем имя.
     *
     * @param name - кличка животного.
     */
    public Chicken(String name) {
        // Вызываем унаследованный метод setName из класса Animal.
        // И указываем имя.
        setName(name);
        // Вызываем унаследованный метод setSpeed из класса Animal.
        // И указываем скорость.
        setSpeed(1);
        // Вызываем унаследованный метод setFlightSpeed из класса Bird.
        setFlightSpeed(0);
        // Вызываем унаследованный метод setSound из класса LandAnimal.
        setSound("kukareku");
    }

    /**
     * Переопределяем метод перемещения из класса Bird. Т.к. это курица, то она не полетит, а побежит.
     *
     * @param distance - расстояние, на которое нужно переместиться
     * @return количество секунд затраченых на перемещение
     */
    @Override
    public double move(double distance) {
        // Вызовем унаследованный метод getSpeed из класса Animal.
        // Так мы получим скорость бега курицы
        return distance / getSpeed();
    }
}
