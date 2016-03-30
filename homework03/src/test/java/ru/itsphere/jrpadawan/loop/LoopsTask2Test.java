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
public class LoopsTask2Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 2");

    @Test
    public void test1() {
        long expectedResult = 12;
        long actualResult = Loops.task2(0, 1);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        long expectedResult = 61;
        long actualResult = Loops.task2(1, 5);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        long expectedResult = 1;
        long actualResult = Loops.task2(1, 0);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }
}
