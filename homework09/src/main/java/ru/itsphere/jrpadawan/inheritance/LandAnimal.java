package ru.itsphere.jrpadawan.inheritance;

/**
 * Абстрактный класс. Сухопутное животное.
 */
public abstract class LandAnimal extends Animal {

    /**
     * Некий звук, который может издавать животное.
     */
    private String sound;

    /**
     * Издать звук.
     */
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
