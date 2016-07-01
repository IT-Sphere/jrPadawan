package ru.itsphere.jrpadawan.inheritance;

/**
 * Created by User on 01.07.2016.
 */
public class Whale extends MarineAnimal {
    public Whale(String name) {
        this.setName(name);
        this.setSpeed(10.3);
    }

    @Override
    public double move(double distance) {
        return distance;
    }

    @Override
    public void setSwimSpeed(double swimSpeed) {
        this.setSpeed(swimSpeed);
    }
}
