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
public class ConditionsIsAllEqualsTest {

    private static CheckingStatus status = new TaskCheckingStatus() {
        @Override
        public String getMessage() {
            return "There is an error in isAllEquals method";
        }
    };

    @Test
    public void testFalse1() {
        AssertWrapper.assertFalse(status, Conditions.isAllEquals(1, -5, -2));
    }

    @Test
    public void testFalse2() {
        AssertWrapper.assertFalse(status, Conditions.isAllEquals(1, 0, 0));
    }

    @Test
    public void testTrue() {
        AssertWrapper.assertTrue(status, Conditions.isAllEquals(1, 1, 1));
    }
}
