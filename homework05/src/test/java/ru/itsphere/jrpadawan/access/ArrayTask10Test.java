package ru.itsphere.jrpadawan.access;

import org.junit.Assert;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class ArrayTask10Test {

    @Test
    public void task10Test1() {
        int[] incomingArray = {10, 22, -43, 64, 105, 0};
        int[] actualArray = Array.task10(incomingArray);
        int[] expectedArray = {-43, 0, 10, 22, 64, 105};
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void task10Test2() {
        int[] incomingArray = {};
        int[] actualArray = Array.task10(incomingArray);
        int[] expectedArray = {};
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void task10Test3() {
        int[] incomingArray = {-10};
        int[] actualArray = Array.task10(incomingArray);
        int[] expectedArray = {-10};
        Assert.assertArrayEquals(expectedArray, actualArray);
    }
}
