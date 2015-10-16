package ru.itsphere.jrpadawan.condition;

import org.junit.Assert;
import org.junit.Test;

public class ConditionsIsAllNot100Test {
    @Test
    public void testFalse1() {
        Assert.assertFalse(Conditions.isAllNot100(100, -5, -2));
    }

    @Test
    public void testFalse2() {
        Assert.assertFalse(Conditions.isAllNot100(100, 0, 333));
    }

    @Test
    public void testTrue() {
        Assert.assertTrue(Conditions.isAllNot100(1, 0, 3100));
    }
}
