package ru.itsphere.jrpadawan.access;

import org.junit.Assert;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class ArrayTask4Test {

    @Test
    public void task4Test1() {
        int[] incomingArray = {10, 22, -43, 64, 105, 3};
        long length = Array.task4(incomingArray);
        Assert.assertEquals(incomingArray.length, length);
    }

    @Test
    public void task4Test2() {
        int[] incomingArray = {};
        long length = Array.task4(incomingArray);
        Assert.assertEquals(incomingArray.length, length);
    }

    @Test
    public void task4Test3() {
        int[] incomingArray = {10};
        long length = Array.task4(incomingArray);
        Assert.assertEquals(incomingArray.length, length);
    }
}
