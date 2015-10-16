package ru.itsphere.jrpadawan.conditions;

import org.junit.Assert;
import org.junit.Test;

public class ConditionsIsAllEqualsTest {
    @Test
    public void testFalse1() {
        Assert.assertFalse(Conditions.isAllEquals(1, -5, -2));
    }

    @Test
    public void testFalse2() {
        Assert.assertFalse(Conditions.isAllEquals(1, 0, 0));
    }

    @Test
    public void testTrue() {
        Assert.assertTrue(Conditions.isAllEquals(1, 1, 1));
    }
}
