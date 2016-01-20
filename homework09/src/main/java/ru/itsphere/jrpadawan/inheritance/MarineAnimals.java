package ru.itsphere.jrpadawan.inheritance;

/**
 * TODO удалить
 */
/**
 * Абстрактный класс. Морское животное.
 */
public abstract class MarineAnimals extends Animal {
    /**
     * Скорость в воде.
     */
    private double swimSpeed;

    /**
     * Движение в воде
     */
    public double move(double distance) {
        return distance / swimSpeed;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }
}
