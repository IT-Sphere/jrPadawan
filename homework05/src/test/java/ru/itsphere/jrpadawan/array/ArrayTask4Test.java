package ru.itsphere.jrpadawan.array;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class ArrayTask4Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 4");

    @Test
    public void task4Test1() {
        int[] incomingArray = {10, 22, -43, 64, 105, 3};
        long length = Array.task4(incomingArray);
        AssertWrapper.assertEquals(status, incomingArray.length, length);
    }

    @Test
    public void task4Test2() {
        int[] incomingArray = {};
        long length = Array.task4(incomingArray);
        AssertWrapper.assertEquals(status, incomingArray.length, length);
    }

    @Test
    public void task4Test3() {
        int[] incomingArray = {10};
        long length = Array.task4(incomingArray);
        AssertWrapper.assertEquals(status, incomingArray.length, length);
    }
}
