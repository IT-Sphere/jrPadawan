package ru.itsphere.jrpadawan.array;

import org.junit.Assert;
import org.junit.Test;
import ru.itsphere.jrpadawan.string.StringTasks;

public class StringTask4Test {

    public static final String EXPECTED_STRING = "Stroki ne sravnivaut cherez '=='";

    @Test
    public void test1() {
        String s = "!";
        boolean result = StringTasks.task4(EXPECTED_STRING + s);
        Assert.assertTrue(result);
    }

    @Test
    public void test2() {
        boolean result = StringTasks.task4("33");
        Assert.assertFalse(result);
    }

    @Test
    public void test3() {
        boolean result = StringTasks.task4("");
        Assert.assertFalse(result);
    }
}
