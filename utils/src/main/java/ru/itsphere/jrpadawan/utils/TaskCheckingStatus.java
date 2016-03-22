package ru.itsphere.jrpadawan.utils;

public abstract class TaskCheckingStatus implements CheckingStatus {

    private boolean hasErrors = false;

    @Override
    public boolean isHasErrors() {
        return hasErrors;
    }

    @Override
    public void setHasErrors() {
        hasErrors = true;
    }
}
