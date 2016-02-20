package main.java.ru.itsphere.jrpadawan.inheritance;

/**
 * Created by Jooble on 21.02.2016.
 */
public class MarineAnimal extends Animal {

    private double swimSpeed;

    @Override
    public double move(double distance) {
        return distance / swimSpeed;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double SwimtSpeed) {
        this.swimSpeed = swimSpeed;
    }
}
