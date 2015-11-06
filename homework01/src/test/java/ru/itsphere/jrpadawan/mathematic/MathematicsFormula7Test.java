package ru.itsphere.jrpadawan.mathematic;

import org.junit.Assert;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class MathematicsFormula7Test {
    @Test
    public void test1() {
        double expectedC = 5;
        double actualC = Mathematics.formula7(3, 4);
        double delta = 0;
        Assert.assertEquals(expectedC, actualC, delta);
    }

    @Test
    public void test2() {
        double expectedC = 3.16;
        double actualC = Mathematics.formula7(1, 3);
        double delta = 0.01;
        Assert.assertEquals(expectedC, actualC, delta);
    }

    @Test
    public void test3() {
        double expectedC = 7.21;
        double actualC = Mathematics.formula7(4, 6);
        double delta = 0.01;
        Assert.assertEquals(expectedC, actualC, delta);
    }
}
