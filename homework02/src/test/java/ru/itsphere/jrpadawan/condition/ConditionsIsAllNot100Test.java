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
public class ConditionsIsAllNot100Test {

    private static CheckingStatus status = new TaskCheckingStatus() {
        @Override
        public String getMessage() {
            return "There is an error in isAllNot100 method";
        }
    };

    @Test
    public void testFalse1() {
        AssertWrapper.assertFalse(status, Conditions.isAllNot100(100, -5, -2));
    }

    @Test
    public void testFalse2() {
        AssertWrapper.assertFalse(status, Conditions.isAllNot100(100, 0, 333));
    }

    @Test
    public void testTrue() {
        AssertWrapper.assertTrue(status, Conditions.isAllNot100(1, 0, 3100));
    }
}
