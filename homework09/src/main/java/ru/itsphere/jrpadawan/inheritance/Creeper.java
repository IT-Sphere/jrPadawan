package ru.itsphere.jrpadawan.inheritance;

public abstract class Creeper extends LandAnimal {
    private double speed;
    private String name;
    private String sound;

    public double move(double distance) {
        return distance / speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void vocalize() {
        System.out.println(sound + "-" + sound + "-" + sound);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

}
