package ru.itsphere.jrpadawan.utils;

import java.util.List;

public interface CheckingStatus {

    List<String> getMessage();

    void addMessage(String message);

    boolean isHasErrors();

    void setHasErrors();
}
