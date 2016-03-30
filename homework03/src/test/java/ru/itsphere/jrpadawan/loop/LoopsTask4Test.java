package ru.itsphere.jrpadawan.loop;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class LoopsTask4Test {
    private static CheckingStatus status = new TaskCheckingStatus() {
        @Override
        public String getMessage() {
            return "There is an error in task 4";
        }
    };

    @Test
    public void test1() {
        long expectedResult = 0;
        long actualResult = Loops.task4(1);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        long expectedResult = 1;
        long actualResult = Loops.task4(2);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        long expectedResult = 514229;
        long actualResult = Loops.task4(30);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }
}
