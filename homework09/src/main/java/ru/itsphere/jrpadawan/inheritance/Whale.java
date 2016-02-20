package main.java.ru.itsphere.jrpadawan.inheritance;

/**
 * Created by Jooble on 21.02.2016.
 */
public class Whale extends MarineAnimal {

    public Whale(String name) {
        setName(name);
        setSpeed(1);
        setswimSpeed(10.3);
        setSound("Буль-Буль:D");
    }
    @Override
    public double move(double distance) {
        return distance / getSpeed();
    }
}
