package ru.itsphere.jrpadawan.access;

import org.junit.Assert;
import org.junit.Test;

public class StringTask7Test {

    @Test
    public void test1() {
        boolean result = StringTasks.task7("sdfsdf aldsbu-ga-gafa fdklf kdfg");
        Assert.assertTrue(result);
    }

    @Test
    public void test2() {
        boolean result = StringTasks.task7("sdfsdf aldsbu-gdfg");
        Assert.assertFalse(result);
    }

    @Test
    public void test3() {
        boolean result = StringTasks.task7("");
        Assert.assertFalse(result);
    }
}
