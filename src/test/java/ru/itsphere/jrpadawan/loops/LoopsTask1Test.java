package ru.itsphere.jrpadawan.loops;

import org.junit.Assert;
import org.junit.Test;

public class LoopsTask1Test {
    @Test
    public void test1() {
        int expectedResult = 5;
        int actualResult = Loops.task1(2, 5);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        int expectedResult = 1;
        int actualResult = Loops.task1(0, 5);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        int expectedResult = 1;
        int actualResult = Loops.task1(2, 0);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
