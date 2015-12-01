package ru.itsphere.jrpadawan.string;

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
    private static int installedCopiesCount = 0;
    private String version = "";
    private List<String> authors = new ArrayList<>();

    public Application(String name) {
        NAME = name;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    // TODO delete this methods

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
