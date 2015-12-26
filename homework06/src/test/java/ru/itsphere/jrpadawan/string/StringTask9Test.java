package ru.itsphere.jrpadawan.string;

import org.junit.Assert;
import org.junit.Test;

public class StringTask9Test {

    @Test
    public void test1() {
        boolean result = StringTasks.task9(new String[]{"2233", "3242dbu-ga-ga", "bu-ga-ga"});
        Assert.assertTrue(result);
    }

    @Test
    public void test2() {
        boolean result = StringTasks.task9(new String[]{"2233", "3242dbu-ga-ga", "bu-ga-"});
        Assert.assertFalse(result);
    }

    @Test
    public void test3() {
        boolean result = StringTasks.task9(new String[]{});
        Assert.assertFalse(result);
    }
}
