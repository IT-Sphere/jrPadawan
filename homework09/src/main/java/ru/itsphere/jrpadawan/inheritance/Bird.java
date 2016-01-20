package ru.itsphere.jrpadawan.inheritance;

/**
 * Абстрактный класс. Любая птица (только летающая).
 */
public abstract class Bird extends LandAnimals {

    /**
     * Скорость в полете.
     */
    private double flightSpeed;

    /**
     * Переопределяем метод перемещения из класса Animal. Т.к. это птица, то она скорее всего полетит, а не побежит.
     * @param distance - расстояние, на которое нужно переместиться
     * @return количество секунд затраченых на перемещение
     */
    @Override
    public double move(double distance) {
        return distance / flightSpeed;
    }

    public double getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(double flightSpeed) {
        this.flightSpeed = flightSpeed;
    }
}
