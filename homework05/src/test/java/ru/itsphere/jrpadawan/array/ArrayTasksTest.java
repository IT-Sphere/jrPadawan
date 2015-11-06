package ru.itsphere.jrpadawan.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTasksTest {

    @Test
    public void task1Test() {
        int[] actualInts = Array.task1();
        int[] expectedInts = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expectedInts, actualInts);
    }

    @Test
    public void task7Test() {
        int[][] expectedArray = {{1, 2, 1, 2}, {1, 2, 1, 2}, {1, 2, 1, 2}};
        int[][] actualArray = Array.task7();
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void task8Test() {
        int[][] expectedArray = {{1, 2, 1, 2}, {1, 2, 1, 2}, {1, 2, 1, 2}};
        int[][] actualArray = Array.task8();
        Assert.assertArrayEquals(expectedArray, actualArray);
    }
}
