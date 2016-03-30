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
public class MathematicsFormula8Test {

    private static CheckingStatus status = new TaskCheckingStatus("There is an error in formula 8");

    @Test
    public void test1() {
        double expectedC = 192;
        double actualC = Mathematics.formula8(3, 4);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedC, actualC, delta);
    }

    @Test
    public void test2() {
        double expectedC = 27;
        double actualC = Mathematics.formula8(1, 3);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedC, actualC, delta);
    }

    @Test
    public void test3() {
        double expectedC = 0;
        double actualC = Mathematics.formula8(0, 0);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedC, actualC, delta);
    }
}
