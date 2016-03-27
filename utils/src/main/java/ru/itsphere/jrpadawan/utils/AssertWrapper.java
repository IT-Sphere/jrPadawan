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

    public static void assertFalse(CheckingStatus status, boolean actual) {
        if (status.isHasErrors()) {
            return;
        }
        try {
            Assert.assertFalse(actual);
        } catch (Throwable e) {
            status.setHasErrors();
            println(status.getMessage());
            throw e;
        }
    }

    public static void assertTrue(CheckingStatus status, boolean actual) {
        if (status.isHasErrors()) {
            return;
        }
        try {
            Assert.assertTrue(actual);
        } catch (Throwable e) {
            status.setHasErrors();
            println(status.getMessage());
            throw e;
        }
    }
}
