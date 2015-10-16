package ru.itsphere.jrpadawan.mathematic;

import org.junit.Assert;
import org.junit.Test;

public class MathematicsFormula4Test {
    @Test
    public void test1() {
        double expectedResult = 1.66;
        double actualResult = Mathematics.formula4(5, 3);
        double delta = 0.01;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        double expectedResult = 0.14;
        double actualResult = Mathematics.formula4(1, 7);
        double delta = 0.01;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        double expectedResult = -2.5;
        double actualResult = Mathematics.formula4(-5, 2);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
