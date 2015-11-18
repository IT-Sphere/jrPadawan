package ru.itsphere.jrpadawan.array;

import org.junit.Assert;
import org.junit.Test;
import ru.itsphere.jrpadawan.string.StringTasks;

public class StringTask11Test {

    @Test
    public void test1() {
        boolean result = StringTasks.task11("2233");
        Assert.assertFalse(result);
    }

    @Test
    public void test2() {
        boolean result = StringTasks.task11("");
        Assert.assertTrue(result);
    }

    @Test
    public void test3() {
        boolean result = StringTasks.task11("222211112222");
        Assert.assertTrue(result);
    }
}
