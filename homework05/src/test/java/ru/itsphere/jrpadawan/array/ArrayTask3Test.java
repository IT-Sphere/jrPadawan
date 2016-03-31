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
public class ArrayTask3Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 3");

    @Test
    public void task3Test1() {
        int expectedResult = 105;
        int[] incomingArray = {10, 22, -43, 64, 105};
        long actualMax = Array.task3(incomingArray);
        AssertWrapper.assertEquals(status, expectedResult, actualMax);
    }

    @Test
    public void task3Test2() {
        int expectedResult = 10;
        int[] incomingArray = {10};
        long actualMax = Array.task3(incomingArray);
        AssertWrapper.assertEquals(status, expectedResult, actualMax);
    }
}
