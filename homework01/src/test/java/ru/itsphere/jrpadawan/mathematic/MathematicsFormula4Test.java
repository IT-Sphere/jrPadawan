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
public class MathematicsFormula4Test {

    private static CheckingStatus status = new TaskCheckingStatus("There is an error in formula 4");

    @Test
    public void test1() {
        double expectedResult = 1.66;
        double actualResult = Mathematics.formula4(5, 3);
        double delta = 0.01;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }

    @Test
    public void test2() {
        double expectedResult = 0.14;
        double actualResult = Mathematics.formula4(1, 7);
        double delta = 0.01;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }

    @Test
    public void test3() {
        double expectedResult = -2.5;
        double actualResult = Mathematics.formula4(-5, 2);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedResult, actualResult, delta);
    }
}
