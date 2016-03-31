package ru.itsphere.jrpadawan.string;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

public class StringTask4Test {
    public static final String EXPECTED_STRING = "Stroki ne sravnivaut cherez '=='";
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 4");

    @Test
    public void test1() {
        String s = "!";
        boolean result = StringTasks.task4(EXPECTED_STRING + s);
        AssertWrapper.assertTrue(status, result);
    }

    @Test
    public void test2() {
        boolean result = StringTasks.task4("33");
        AssertWrapper.assertFalse(status, result);
    }

    @Test
    public void test3() {
        boolean result = StringTasks.task4("");
        AssertWrapper.assertFalse(status, result);
    }
}
