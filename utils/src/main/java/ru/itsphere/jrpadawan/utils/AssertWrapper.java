package ru.itsphere.jrpadawan.utils;

import org.junit.Assert;

import static ru.itsphere.jrpadawan.utils.ErrorOutputUtils.println;

public class AssertWrapper {

    static public void assertEquals(CheckingStatus status, double expected, double actual, double delta) {
        if (status.isHasErrors()) {
            return;
        }
        try {
            Assert.assertEquals(expected, actual, delta);
        } catch (Throwable e) {
            status.setHasErrors();
            println(status.getMessage());
            throw e;
        }
    }
}
