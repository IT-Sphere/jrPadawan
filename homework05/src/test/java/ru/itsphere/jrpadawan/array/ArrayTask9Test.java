package ru.itsphere.jrpadawan.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class ArrayTask9Test {

    @Test
    public void task9Test1() {
        long[] incomingArray = {10, 22, -43, 64, 105, 3};
        long[] expectedArray = {3, 105, 64, -43, 22, 10};
        long[] actualArray = Array.task9(incomingArray);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void task9Test2() {
        long[] incomingArray = {};
        long[] expectedArray = {};
        long[] actualArray = Array.task9(incomingArray);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void task9Test3() {
        long[] incomingArray = {10};
        long[] expectedArray = {10};
        long[] actualArray = Array.task9(incomingArray);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }
}
