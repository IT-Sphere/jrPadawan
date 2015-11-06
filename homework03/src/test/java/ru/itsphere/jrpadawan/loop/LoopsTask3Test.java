package ru.itsphere.jrpadawan.loop;

import org.junit.Assert;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class LoopsTask3Test {
    @Test
    public void test1() {
        long expectedResult = 505;
        long actualResult = Loops.task3(0, 101);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        long expectedResult = -500;
        long actualResult = Loops.task3(0, 50);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        long expectedResult = 1024;
        long actualResult = Loops.task3(1, 100);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
