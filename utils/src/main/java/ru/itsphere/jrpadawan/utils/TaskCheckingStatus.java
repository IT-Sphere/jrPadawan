package ru.itsphere.jrpadawan.utils;

import java.util.LinkedList;
import java.util.List;

public class TaskCheckingStatus implements CheckingStatus {

    private boolean hasErrors = false;
    private List<String> messages = new LinkedList<>();

    public TaskCheckingStatus(String message) {
        messages.add(message);
    }

    @Override
    public List<String> getMessage() {
        return messages;
    }

    @Override
    public void addMessage(String message) {
        getMessage().add(message);
    }

    @Override
    public boolean isHasErrors() {
        return hasErrors;
    }

    @Override
    public void setHasErrors() {
        hasErrors = true;
    }
}
