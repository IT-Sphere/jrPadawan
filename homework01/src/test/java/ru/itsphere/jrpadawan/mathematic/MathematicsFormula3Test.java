package ru.itsphere.jrpadawan.mathematic;

import org.junit.Assert;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class MathematicsFormula3Test {
    @Test
    public void test1() {
        int expectedResult = -10;
        int actualResult = Mathematics.formula3(5, 3);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        int expectedResult = -27;
        int actualResult = Mathematics.formula3(0, 7);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        int expectedResult = -17;
        int actualResult = Mathematics.formula3(-5, 2);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
