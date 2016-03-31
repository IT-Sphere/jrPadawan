package ru.itsphere.jrpadawan.string;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

public class StringTask9Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 9");

    @Test
    public void test1() {
        boolean result = StringTasks.task9(new String[]{"2233", "3242dbu-ga-ga", "bu-ga-ga"});
        AssertWrapper.assertTrue(status, result);
    }

    @Test
    public void test2() {
        boolean result = StringTasks.task9(new String[]{"2233", "3242dbu-ga-ga", "bu-ga-"});
        AssertWrapper.assertFalse(status, result);
    }

    @Test
    public void test3() {
        boolean result = StringTasks.task9(new String[]{});
        AssertWrapper.assertFalse(status, result);
    }
}
