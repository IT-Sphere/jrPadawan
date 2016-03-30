package ru.itsphere.jrpadawan.condition;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class ConditionsIsAtLeastOne100Test {

    private static CheckingStatus status = new TaskCheckingStatus("There is an error in isAtLeastOne100 method");

    @Test
    public void testFalse1() {
        AssertWrapper.assertFalse(status, Conditions.isAtLeastOne100(0, -5, -2));
    }

    @Test
    public void testFalse2() {
        AssertWrapper.assertFalse(status, Conditions.isAtLeastOne100(0, 0, 333));
    }

    @Test
    public void testTrue() {
        AssertWrapper.assertTrue(status, Conditions.isAtLeastOne100(100, 5, 4));
    }
}
