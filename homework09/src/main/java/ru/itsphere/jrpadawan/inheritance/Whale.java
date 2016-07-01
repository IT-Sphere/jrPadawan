package ru.itsphere.jrpadawan.inheritance;

/**
 * Created by User on 01.07.2016.
 */
public class Whale extends MarineAnimal {
    public Whale(String name) {
        setName(name);
        setSwimSpeed(10.3);
    }

    @Override
    public  double move(double distance) {
        return  distance / getSwimSpeed();
    }
}
