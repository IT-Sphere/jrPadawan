package ru.itsphere.jrpadawan.utils;

public interface CheckingStatus {

    String getMessage();

    boolean isHasErrors();

    void setHasErrors();
}
