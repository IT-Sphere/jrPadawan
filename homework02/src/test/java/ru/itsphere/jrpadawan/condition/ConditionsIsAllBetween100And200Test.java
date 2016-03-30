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
public class ConditionsIsAllBetween100And200Test {

    private static CheckingStatus status = new TaskCheckingStatus("There is an error in isAllBetween100And200 method");

    @Test
    public void testFalse1() {
        AssertWrapper.assertFalse(status, Conditions.isAllBetween100And200(100, -5, -2));
    }

    @Test
    public void testFalse2() {
        AssertWrapper.assertFalse(status, Conditions.isAllBetween100And200(100, 0, 333));
    }

    @Test
    public void testTrue() {
        AssertWrapper.assertTrue(status, Conditions.isAllBetween100And200(100, 100, 100));
    }
}
