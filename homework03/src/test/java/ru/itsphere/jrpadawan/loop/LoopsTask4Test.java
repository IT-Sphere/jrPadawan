package ru.itsphere.jrpadawan.loop;

import org.junit.Assert;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class LoopsTask4Test {
    @Test
    public void test1() {
        long expectedResult = 0;
        long actualResult = Loops.task4(1);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        long expectedResult = 1;
        long actualResult = Loops.task4(2);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        long expectedResult = 514229;
        long actualResult = Loops.task4(30);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
