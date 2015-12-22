package ru.itsphere.jrpadawan.access;

import org.junit.Assert;
import org.junit.Test;

public class StringTasksTest {

    @Test
    public void task1Test() {
        String expected = "Hello world";
        String actual = StringTasks.task1();
        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void task2Test() {
        String someWord = "Hi";
        String expected = someWord + " world";
        String actual = StringTasks.task2(someWord);
        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void task3Test() {
        String original = "Hi";
        String actual = StringTasks.task3(original);
        Assert.assertNotNull(actual);
        Assert.assertTrue(actual != original);
        Assert.assertEquals(original, actual);
    }

    @Test
    public void task5Test() {
        String text = "lsdkgfdsglm;asng ;djsfgkjdfs;ljg;ldfjsg;ljs";
        int actual = StringTasks.task5(text);
        Assert.assertEquals(text.length(), actual);
    }

    @Test
    public void task6Test() {
        String p = "p";
        String text = "lsdkgfdsglm;" + p + "sng";
        char actual = StringTasks.task6(text);
        Assert.assertEquals(p.charAt(0), actual);
    }

    @Test
    public void task8Test() {
        String text = "sdfsdf aldsbu-ga-gafa fdklf kdfg";
        int actual = StringTasks.task8(text);
        int expected = text.indexOf("bu-ga-ga");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void task10Test() {
        String expectedSubstring = "sdf al";
        String text = "sdf" + expectedSubstring + "u-ga-gafa fdklf kdfg";
        String actual = StringTasks.task10(text);
        Assert.assertEquals(expectedSubstring, actual);
    }
}
