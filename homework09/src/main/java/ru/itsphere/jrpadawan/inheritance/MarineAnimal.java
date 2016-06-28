package ru.itsphere.jrpadawan.inheritance;

public abstract class MarineAnimal extends Animal {
    private double swimSpeed;

    public double move(double distance) {
        return distance / swimSpeed;
    }

    //скорость в воде
    public void setSwimSpeedSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }
}
