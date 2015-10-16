package ru.itsphere.jrpadawan.loop;

import org.junit.Assert;
import org.junit.Test;

public class LoopsTask1Test {
    @Test
    public void test1() {
        long expectedResult = 11370;
        long actualResult = Loops.task1(2, 5);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        long expectedResult = 5120;
        long actualResult = Loops.task1(0, 5);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        long expectedResult = 6250;
        long actualResult = Loops.task1(2, 0);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
