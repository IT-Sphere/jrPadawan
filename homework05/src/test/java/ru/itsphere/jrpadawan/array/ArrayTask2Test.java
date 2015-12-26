package ru.itsphere.jrpadawan.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class ArrayTask2Test {

    @Test
    public void task2Test1() {
        int expectedResult = 158;
        int[] incomingArray = {10, 22, -43, 64, 105};
        long actualSum = Array.task2(incomingArray);
        Assert.assertEquals(expectedResult, actualSum);
    }

    @Test
    public void task2Test2() {
        int expectedResult = 0;
        int[] incomingArray = {};
        long actualSum = Array.task2(incomingArray);
        Assert.assertEquals(expectedResult, actualSum);
    }

    @Test
    public void task2Test3() {
        int expectedResult = 10;
        int[] incomingArray = {10};
        long actualSum = Array.task2(incomingArray);
        Assert.assertEquals(expectedResult, actualSum);
    }
}
