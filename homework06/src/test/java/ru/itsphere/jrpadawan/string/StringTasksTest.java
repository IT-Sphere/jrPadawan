package ru.itsphere.jrpadawan.string;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

public class StringTasksTest {
    private static CheckingStatus statusTask1 = new TaskCheckingStatus("There is an error in task 1");
    private static CheckingStatus statusTask2 = new TaskCheckingStatus("There is an error in task 2");
    private static CheckingStatus statusTask3 = new TaskCheckingStatus("There is an error in task 3");
    private static CheckingStatus statusTask5 = new TaskCheckingStatus("There is an error in task 5");
    private static CheckingStatus statusTask6 = new TaskCheckingStatus("There is an error in task 6");
    private static CheckingStatus statusTask8 = new TaskCheckingStatus("There is an error in task 8");
    private static CheckingStatus statusTask10 = new TaskCheckingStatus("There is an error in task 10");

    @Test
    public void task1Test() {
        String expected = "Hello world";
        String actual = StringTasks.task1();
        AssertWrapper.assertNotNull(statusTask1, actual);
        AssertWrapper.assertEquals(statusTask1, expected, actual);
    }

    @Test
    public void task2Test() {
        String someWord = "Hi";
        String expected = someWord + " world";
        String actual = StringTasks.task2(someWord);
        AssertWrapper.assertNotNull(statusTask2, actual);
        AssertWrapper.assertEquals(statusTask2, expected, actual);
    }

    @Test
    public void task3Test() {
        String original = "Hi";
        String actual = StringTasks.task3(original);
        AssertWrapper.assertNotNull(statusTask3, actual);
        AssertWrapper.assertTrue(statusTask3, actual != original);
        AssertWrapper.assertEquals(statusTask3, original, actual);
    }

    @Test
    public void task5Test() {
        String text = "lsdkgfdsglm;asng ;djsfgkjdfs;ljg;ldfjsg;ljs";
        int actual = StringTasks.task5(text);
        AssertWrapper.assertEquals(statusTask5, text.length(), actual);
    }

    @Test
    public void task6Test() {
        String p = "p";
        String text = "lsdkgfdsglm;" + p + "sng";
        char actual = StringTasks.task6(text);
        AssertWrapper.assertEquals(statusTask6, p.charAt(0), actual);
    }

    @Test
    public void task8Test() {
        String text = "sdfsdf aldsbu-ga-gafa fdklf kdfg";
        int actual = StringTasks.task8(text);
        int expected = text.indexOf("bu-ga-ga");
        AssertWrapper.assertEquals(statusTask8, expected, actual);
    }

    @Test
    public void task10Test() {
        String expectedSubstring = "sdf al";
        String text = "sdf" + expectedSubstring + "u-ga-gafa fdklf kdfg";
        String actual = StringTasks.task10(text);
        AssertWrapper.assertEquals(statusTask10, expectedSubstring, actual);
    }
}
