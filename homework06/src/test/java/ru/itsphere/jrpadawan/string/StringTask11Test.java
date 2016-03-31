package ru.itsphere.jrpadawan.string;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

public class StringTask11Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 11");

    @Test
    public void test1() {
        boolean result = StringTasks.task11("2233");
        AssertWrapper.assertFalse(status, result);
    }

    @Test
    public void test2() {
        boolean result = StringTasks.task11("");
        AssertWrapper.assertTrue(status, result);
    }

    @Test
    public void test3() {
        boolean result = StringTasks.task11("222211112222");
        AssertWrapper.assertTrue(status, result);
    }
}
