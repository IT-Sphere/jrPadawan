package ru.itsphere.jrpadawan.string;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

public class StringTask7Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 7");

    @Test
    public void test1() {
        boolean result = StringTasks.task7("sdfsdf aldsbu-ga-gafa fdklf kdfg");
        AssertWrapper.assertTrue(status, result);
    }

    @Test
    public void test2() {
        boolean result = StringTasks.task7("sdfsdf aldsbu-gdfg");
        AssertWrapper.assertFalse(status, result);
    }

    @Test
    public void test3() {
        boolean result = StringTasks.task7("");
        AssertWrapper.assertFalse(status, result);
    }
}
