package ru.itsphere.jrpadawan.inheritance;

/**
 * Created by User on 01.07.2016.
 */
public abstract class MarineAnimal extends Animal {
    private double swimSpeed;

    @Override
    public abstract double move(double distance);
    public abstract void setSwimSpeed(double swimSpeed);
}
