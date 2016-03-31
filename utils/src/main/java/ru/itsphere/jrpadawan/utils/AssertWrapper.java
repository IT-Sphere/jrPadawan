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

    static public void assertEquals(CheckingStatus status, long expected, long actual) {
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

    static public void assertTrue(CheckingStatus status, boolean actual) {
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

    static public void assertNotNull(CheckingStatus status, Object obj) {
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

    static public void fail(CheckingStatus status, String message) {
        if (status.isHasErrors()) {
            return;
        }
        try {
            Assert.fail();
        } catch (Throwable e) {
            status.setHasErrors();
            status.addMessage(message);
            println(status.getMessage());
            throw e;
        }
    }

    public static void assertArrayEquals(CheckingStatus status, int[] expectedArray, int[] actualArray) {
        if (status.isHasErrors()) {
            return;
        }
        try {
            Assert.assertArrayEquals(expectedArray, actualArray);
        } catch (Throwable e) {
            status.setHasErrors();
            println(status.getMessage());
            throw e;
        }
    }

    public static void assertArrayEquals(CheckingStatus status, long[] expectedArray, long[] actualArray) {
        if (status.isHasErrors()) {
            return;
        }
        try {
            Assert.assertArrayEquals(expectedArray, actualArray);
        } catch (Throwable e) {
            status.setHasErrors();
            println(status.getMessage());
            throw e;
        }
    }

    public static void assertArrayEquals(CheckingStatus status, int[][] expectedArray, int[][] actualArray) {
        if (status.isHasErrors()) {
            return;
        }
        try {
            Assert.assertArrayEquals(expectedArray, actualArray);
        } catch (Throwable e) {
            status.setHasErrors();
            println(status.getMessage());
            throw e;
        }
    }

    public static void assertNotNull(CheckingStatus status, String message, Object object) {
        if (status.isHasErrors()) {
            return;
        }
        try {
            Assert.assertNotNull(object);
        } catch (Throwable e) {
            status.setHasErrors();
            status.addMessage(message);
            println(status.getMessage());
            throw e;
        }
    }
}
