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
public class ArrayTask2Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 2");

    @Test
    public void task2Test1() {
        int expectedResult = 158;
        int[] incomingArray = {10, 22, -43, 64, 105};
        long actualSum = Array.task2(incomingArray);
        AssertWrapper.assertEquals(status, expectedResult, actualSum);
    }

    @Test
    public void task2Test2() {
        int expectedResult = 0;
        int[] incomingArray = {};
        long actualSum = Array.task2(incomingArray);
        AssertWrapper.assertEquals(status, expectedResult, actualSum);
    }

    @Test
    public void task2Test3() {
        int expectedResult = 10;
        int[] incomingArray = {10};
        long actualSum = Array.task2(incomingArray);
        AssertWrapper.assertEquals(status, expectedResult, actualSum);
    }
}
