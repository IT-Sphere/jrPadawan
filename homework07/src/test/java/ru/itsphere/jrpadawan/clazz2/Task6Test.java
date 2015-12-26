package ru.itsphere.jrpadawan.clazz2;

import org.junit.Assert;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class Task6Test {
    @Test
    public void test1() {
        long expectedResult = 24;
        long actualResult = Tasks.task6(4);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        long expectedResult = 1;
        long actualResult = Tasks.task6(0);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        long expectedResult = 3628800;
        long actualResult = Tasks.task6(10);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test4() {
        long expectedResult = 1;
        long actualResult = Tasks.task6(1);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
