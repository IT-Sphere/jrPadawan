package ru.itsphere.jrpadawan.mathematics;

import org.junit.Assert;
import org.junit.Test;

public class MathematicsFormula9Test {
    @Test
    public void test1() {
        double expectedC = 19683;
        double actualC = Mathematics.formula9(3);
        double delta = 0;
        Assert.assertEquals(expectedC, actualC, delta);
    }

    @Test
    public void test2() {
        double expectedC = 1;
        double actualC = Mathematics.formula9(1);
        double delta = 0;
        Assert.assertEquals(expectedC, actualC, delta);
    }

    @Test
    public void test3() {
        double expectedC = 512;
        double actualC = Mathematics.formula9(2);
        double delta = 0;
        Assert.assertEquals(expectedC, actualC, delta);
    }
}
