package ru.itsphere.jrpadawan.mathematics;

import org.junit.Assert;
import org.junit.Test;

public class MathematicsFormula2Test {
    @Test
    public void test1() {
        int expectedResult = 35;
        int actualResult = Mathematics.formula2(5);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        int expectedResult = 0;
        int actualResult = Mathematics.formula2(0);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        int expectedResult = 15;
        int actualResult = Mathematics.formula2(-5);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
