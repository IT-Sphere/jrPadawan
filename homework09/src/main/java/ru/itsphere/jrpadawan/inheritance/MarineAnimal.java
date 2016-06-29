package ru.itsphere.jrpadawan.inheritance;

public abstract class MarineAnimal extends Animal {
    private double swimSpeed;
    private String name;
    private String sound;

    public double move(double distance) {
        return distance / swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
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
