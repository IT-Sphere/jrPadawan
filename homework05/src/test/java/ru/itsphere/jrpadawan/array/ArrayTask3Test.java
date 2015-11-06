package ru.itsphere.jrpadawan.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTask3Test {

    @Test
    public void task3Test1() {
        int expectedResult = 105;
        int[] incomingArray = {10, 22, -43, 64, 105};
        long actualMax = Array.task3(incomingArray);
        Assert.assertEquals(expectedResult, actualMax);
    }

    @Test
    public void task3Test2() {
        int expectedResult = 10;
        int[] incomingArray = {10};
        long actualMax = Array.task3(incomingArray);
        Assert.assertEquals(expectedResult, actualMax);
    }
}
