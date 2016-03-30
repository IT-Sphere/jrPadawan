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
public class LoopsTask3Test {
    private static CheckingStatus status = new TaskCheckingStatus("There is an error in task 3");

    @Test
    public void test1() {
        long expectedResult = 505;
        long actualResult = Loops.task3(0, 101);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        long expectedResult = -500;
        long actualResult = Loops.task3(0, 50);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        long expectedResult = 1024;
        long actualResult = Loops.task3(1, 100);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }
}
