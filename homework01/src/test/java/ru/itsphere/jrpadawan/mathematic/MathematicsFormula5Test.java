package ru.itsphere.jrpadawan.mathematic;

import org.junit.Assert;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class MathematicsFormula5Test {
    @Test
    public void test1() {
        double expectedResult = 0.2;
        double actualResult = Mathematics.formula5(5, 3);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        double expectedResult = 1;
        double actualResult = Mathematics.formula5(1, 7);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        double expectedResult = -0.2;
        double actualResult = Mathematics.formula5(-5, 2);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
