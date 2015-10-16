package ru.itsphere.jrpadawan.mathematics;

import org.junit.Assert;
import org.junit.Test;

public class MathematicsFormula6Test {
    @Test
    public void test1() {
        double expectedResult = 0.77;
        double actualResult = Mathematics.formula6(5, 3);
        double delta = 0.01;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        double expectedResult = 0.52;
        double actualResult = Mathematics.formula6(1, 7);
        double delta = 0.01;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        double expectedResult = 0;
        double actualResult = Mathematics.formula6(5, 0);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
