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
public class MathematicsFormula2Test {

    private static CheckingStatus status = new TaskCheckingStatus("There is an error in formula 2");

    @Test
    public void test1() {
        int expectedResult = 35;
        int actualResult = Mathematics.formula2(5);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        int expectedResult = 0;
        int actualResult = Mathematics.formula2(0);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        int expectedResult = 15;
        int actualResult = Mathematics.formula2(-5);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }
}
