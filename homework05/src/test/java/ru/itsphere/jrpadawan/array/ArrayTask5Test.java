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
public class ArrayTask5Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 5");

    @Test
    public void task5Test1() {
        int[] expectedArray = {20, 44, -86, 128, 210};
        int[] incomingArray = {10, 22, -43, 64, 105};
        int[] actualArray = Array.task5(incomingArray);
        AssertWrapper.assertArrayEquals(status, expectedArray, actualArray);
    }

    @Test
    public void task5Test2() {
        int[] expectedArray = {};
        int[] incomingArray = {};
        int[] actualArray = Array.task5(incomingArray);
        AssertWrapper.assertArrayEquals(status, expectedArray, actualArray);
    }

    @Test
    public void task5Test3() {
        int[] expectedArray = {20};
        int[] incomingArray = {10};
        int[] actualArray = Array.task5(incomingArray);
        AssertWrapper.assertArrayEquals(status, expectedArray, actualArray);
    }
}
