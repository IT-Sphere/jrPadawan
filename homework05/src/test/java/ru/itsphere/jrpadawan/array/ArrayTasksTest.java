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
public class ArrayTasksTest {

    private static CheckingStatus statusTask1 = new TaskCheckingStatus("There is an error in task 1");

    private static CheckingStatus statusTask7 = new TaskCheckingStatus("There is an error in task 7");

    private static CheckingStatus statusTask8 = new TaskCheckingStatus("There is an error in task 8");

    @Test
    public void task1Test() {
        int[] actualInts = Array.task1();
        int[] expectedInts = {1, 2, 3, 4, 5};
        AssertWrapper.assertArrayEquals(statusTask1, expectedInts, actualInts);
    }

    @Test
    public void task7Test() {
        int[][] expectedArray = {{1, 2, 1, 2}, {1, 2, 1, 2}, {1, 2, 1, 2}};
        int[][] actualArray = Array.task7();
        AssertWrapper.assertArrayEquals(statusTask7, expectedArray, actualArray);
    }

    @Test
    public void task8Test() {
        int[][] expectedArray = {{1, 2, 1, 2}, {1, 2, 1, 2}, {1, 2, 1, 2}};
        int[][] actualArray = Array.task8();
        AssertWrapper.assertArrayEquals(statusTask8, expectedArray, actualArray);
    }
}
