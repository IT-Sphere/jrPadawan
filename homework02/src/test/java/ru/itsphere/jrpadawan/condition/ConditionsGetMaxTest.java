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
public class ConditionsGetMaxTest {

    private static CheckingStatus status = new TaskCheckingStatus() {
        @Override
        public String getMessage() {
            return "There is an error in getMax method";
        }
    };

    @Test
    public void test1() {
        int expectedResult = 5;
        int actualResult = Conditions.getMax(5, 0, 3);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        int expectedResult = 1;
        int actualResult = Conditions.getMax(1, 0, 0);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        int expectedResult = 1;
        int actualResult = Conditions.getMax(1, -5, -2);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }
}
