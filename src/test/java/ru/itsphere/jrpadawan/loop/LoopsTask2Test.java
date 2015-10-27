package ru.itsphere.jrpadawan.loop;

import org.junit.Assert;
import org.junit.Test;

public class LoopsTask2Test {
    @Test
    public void test1() {
        long expectedResult = 12;
        long actualResult = Loops.task2(0, 1);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        long expectedResult = 61;
        long actualResult = Loops.task2(1, 5);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        long expectedResult = 1;
        long actualResult = Loops.task2(1, 0);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
