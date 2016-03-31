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
public class ArrayTask10Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 10");

    @Test
    public void task10Test1() {
        int[] incomingArray = {10, 22, -43, 64, 105, 0};
        int[] actualArray = Array.task10(incomingArray);
        int[] expectedArray = {-43, 0, 10, 22, 64, 105};
        AssertWrapper.assertArrayEquals(status, expectedArray, actualArray);
    }

    @Test
    public void task10Test2() {
        int[] incomingArray = {};
        int[] actualArray = Array.task10(incomingArray);
        int[] expectedArray = {};
        AssertWrapper.assertArrayEquals(status, expectedArray, actualArray);
    }

    @Test
    public void task10Test3() {
        int[] incomingArray = {-10};
        int[] actualArray = Array.task10(incomingArray);
        int[] expectedArray = {-10};
        AssertWrapper.assertArrayEquals(status, expectedArray, actualArray);
    }
}
