package ru.itsphere.jrpadawan.inheritance;

/**
 * Created by User on 01.07.2016.
 */
public class Snake extends Creeper {
    public Snake(String name) {
        this.setName(name);
        this.setSpeed(3.1);
        this.setSound("sh");
    }
}
