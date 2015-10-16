package ru.itsphere.jrpadawan.conditions;

import org.junit.Assert;
import org.junit.Test;
import ru.itsphere.jrpadawan.Conditions.Conditions;

public class ConditionsGetMaxTest {
    @Test
    public void test1() {
        int expectedResult = 5;
        int actualResult = Conditions.getMax(5, 0, 3);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        int expectedResult = 1;
        int actualResult = Conditions.getMax(1, 0, 0);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        int expectedResult = 1;
        int actualResult = Conditions.getMax(1, -5, -2);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
