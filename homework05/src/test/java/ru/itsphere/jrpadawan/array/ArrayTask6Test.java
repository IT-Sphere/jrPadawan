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
public class ArrayTask6Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 6");

    @Test
    public void task6Test1() {
        int[] array1 = {20, 44, -86, 128, 210};
        int[] array2 = {202, 44, -846, 1258, 2210, 3};
        int[] expectedArray = {20, 44, -86, 128, 210, 202, 44, -846, 1258, 2210, 3};
        int[] actualArray = Array.task6(array1, array2);
        AssertWrapper.assertArrayEquals(status, expectedArray, actualArray);
    }

    @Test
    public void task6Test2() {
        int[] array1 = {};
        int[] array2 = {202, 44, -846, 1258, 2210, 3};
        int[] expectedArray = {202, 44, -846, 1258, 2210, 3};
        int[] actualArray = Array.task6(array1, array2);
        AssertWrapper.assertArrayEquals(status, expectedArray, actualArray);
    }

    @Test
    public void task6Test4() {
        int[] array1 = {};
        int[] array2 = {};
        int[] expectedArray = {};
        int[] actualArray = Array.task6(array1, array2);
        AssertWrapper.assertArrayEquals(status, expectedArray, actualArray);
    }

    @Test
    public void task6Test5() {
        int[] array1 = {20, 44, -86, 128, 210};
        int[] array2 = {};
        int[] expectedArray = {20, 44, -86, 128, 210};
        int[] actualArray = Array.task6(array1, array2);
        AssertWrapper.assertArrayEquals(status, expectedArray, actualArray);
    }

    @Test
    public void task6Test6() {
        int[] array1 = {20};
        int[] array2 = {20};
        int[] expectedArray = {20, 20};
        int[] actualArray = Array.task6(array1, array2);
        AssertWrapper.assertArrayEquals(status, expectedArray, actualArray);
    }
}
