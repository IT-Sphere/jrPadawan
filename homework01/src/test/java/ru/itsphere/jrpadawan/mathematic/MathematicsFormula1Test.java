package ru.itsphere.jrpadawan.mathematic;

import org.junit.Test;
import ru.itsphere.jrpadawan.utils.AssertWrapper;
import ru.itsphere.jrpadawan.utils.CheckingStatus;
import ru.itsphere.jrpadawan.utils.TaskCheckingStatus;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class MathematicsFormula1Test {

    private static CheckingStatus status = new TaskCheckingStatus("There is an error in formula 1");

    @Test
    public void test1() {
        int expectedResult = 8;
        int actualResult = Mathematics.formula1(5);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        int expectedResult = -2;
        int actualResult = Mathematics.formula1(0);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        int expectedResult = -12;
        int actualResult = Mathematics.formula1(-5);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }
}
