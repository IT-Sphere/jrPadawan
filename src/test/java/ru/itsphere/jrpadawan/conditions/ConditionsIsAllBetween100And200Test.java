package ru.itsphere.jrpadawan.conditions;

import org.junit.Assert;
import org.junit.Test;

public class ConditionsIsAllBetween100And200Test {
    @Test
    public void testFalse1() {
        Assert.assertFalse(Conditions.isAllBetween100And200(100, -5, -2));
    }

    @Test
    public void testFalse2() {
        Assert.assertFalse(Conditions.isAllBetween100And200(100, 0, 333));
    }

    @Test
    public void testTrue() {
        Assert.assertTrue(Conditions.isAllBetween100And200(100, 100, 100));
    }
}
