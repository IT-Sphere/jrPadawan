package ru.itsphere.jrpadawan.conditions;

import org.junit.Assert;
import org.junit.Test;
import ru.itsphere.jrpadawan.Conditions.Conditions;

public class ConditionsGetMinTest {
    @Test
    public void test1() {
        int expectedResult = 0;
        int actualResult = Conditions.getMin(5, 0, 3);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        int expectedResult = 0;
        int actualResult = Conditions.getMin(1, 0, 0);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        int expectedResult = -5;
        int actualResult = Conditions.getMin(1, -5, -2);
        double delta = 0;
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
