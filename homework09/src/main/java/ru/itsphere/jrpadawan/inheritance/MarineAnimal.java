package ru.itsphere.jrpadawan.inheritance;

/**
 * Created by karoline on 29.6.16.
 */
public abstract class MarineAnimal extends Animal {
    private double swimSpeed;

    @Override
    public double move(double distance) {
        return distance / swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }
}
