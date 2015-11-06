package ru.itsphere.jrpadawan.condition;

import org.junit.Assert;
import org.junit.Test;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class ConditionsIsMoreThen100OrEqualsTest {
    @Test
    public void testFalse1() {
        Assert.assertFalse(Conditions.isMoreThen100OrEquals(100, -5, -2));
    }

    @Test
    public void testFalse2() {
        Assert.assertFalse(Conditions.isMoreThen100OrEquals(100, 0, 333));
    }

    @Test
    public void testTrue() {
        Assert.assertTrue(Conditions.isMoreThen100OrEquals(100, 100, 100));
    }
}
