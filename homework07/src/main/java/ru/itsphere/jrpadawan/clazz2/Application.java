package ru.itsphere.jrpadawan.clazz2;

import java.util.ArrayList;
import java.util.List;

/**
 * Этот класс представляет любое приложени.
 * Например браузер Chrome или игру Angry Birds.
 * <p>
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class Application {
    private final String NAME;
    private static int createdApplicationCount = 0;
    private String version = "";
    private List<String> authors = new ArrayList<>();

    public Application(String name,String version) {
        NAME = name;
        this.version = version;
        createdApplicationCount++;

    }

    public Application(String name) {
        NAME = name;
        createdApplicationCount++;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getVersion() {
        return version;
    }

    public static void resetCreatedApplicationCount() {
        createdApplicationCount = 0;
    }

    Aplication one = new Aplication();
    Aplication two = new Aplication();
    Aplication three = new Aplication();

    public int getCreatedApplicationCount(){
        return createdApplicationCount;
    }



    public void setVersion(String version){
        this.version = version;
    }

    public void setVersion(int version){
        this.version = String.valueOf(version);
    }
}
