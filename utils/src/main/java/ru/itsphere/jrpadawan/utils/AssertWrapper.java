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

    static public void assertEquals(CheckingStatus status, Object expected, Object actual) {
        if (status.isHasErrors()) {
            return;
        }
        try {
            Assert.assertEquals(expected, actual);
        } catch (Throwable e) {
            status.setHasErrors();
            println(status.getMessage());
            throw e;
        }
    }

    static public void assertEquals(CheckingStatus status, int expected, int actual) {
        assertEquals(status, expected, actual, 0);
    }

    static public void assertFalse(CheckingStatus status, boolean actual) {
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

    public static void assertNotNull(CheckingStatus status, Object obj) {
        if (status.isHasErrors()) {
            return;
        }
        try {
            Assert.assertNotNull(obj);
        } catch (Throwable e) {
            status.setHasErrors();
            println(status.getMessage());
            throw e;
        }
    }

    static public void fail(CheckingStatus status) {
        fail(status, null);
    }

    public static void fail(CheckingStatus status, String message) {
        if (status.isHasErrors()) {
            return;
        }
        try {
            if (message == null) {
                Assert.fail();
            } else {
                status.addMessage(message);
                Assert.fail(message);
            }
        } catch (Throwable e) {
            status.setHasErrors();
            println(status.getMessage());
            throw e;
        }
    }
}
