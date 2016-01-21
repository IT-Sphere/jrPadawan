package ru.itsphere.jrpadawan.inheritance;

/**
 * Абстрактный класс. Животное.
 */
public abstract class Animal {
    /**
     * Личное имя животного. Например, 'Шарик или Симба".
     */
    private String name;

    /**
     * Скорость с которой оно перемещается.
     * Количество метров за секунду.
     */
    private double speed;

    /**
     * Заставляет животное перемещаться.
     *
     * @param distance - расстояние, на которое нужно переместиться
     * @return количество секунд затраченых на перемещение
     */
    public double move(double distance) {
        return distance / speed;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
