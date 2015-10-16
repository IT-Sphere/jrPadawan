package ru.itsphere.jrpadawan.conditions;

import org.junit.Assert;
import org.junit.Test;

public class ConditionsIsAtLeastOne100Test {
    @Test
    public void testFalse1() {
        Assert.assertFalse(Conditions.isAtLeastOne100(0, -5, -2));
    }

    @Test
    public void testFalse2() {
        Assert.assertFalse(Conditions.isAtLeastOne100(0, 0, 333));
    }

    @Test
    public void testTrue() {
        Assert.assertTrue(Conditions.isAtLeastOne100(100, 5, 4));
    }
}
