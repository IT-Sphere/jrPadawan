package ru.itsphere.jrpadawan.mathematics;

import org.junit.Assert;
import org.junit.Test;

public class MathematicsFormula1Test {
    @Test
    public void test1() {
        int expectedResult = 8;
        int actualResult = Mathematics.formula1(5);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        int expectedResult = -2;
        int actualResult = Mathematics.formula1(0);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        int expectedResult = -12;
        int actualResult = Mathematics.formula1(-5);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
