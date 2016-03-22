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
public class MathematicsFormula9Test {

    private static CheckingStatus status = new TaskCheckingStatus() {
        @Override
        public String getMessage() {
            return "There is an error in formula 9";
        }
    };

    @Test
    public void test1() {
        double expectedC = 19683;
        double actualC = Mathematics.formula9(3);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedC, actualC, delta);
    }

    @Test
    public void test2() {
        double expectedC = 1;
        double actualC = Mathematics.formula9(1);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedC, actualC, delta);
    }

    @Test
    public void test3() {
        double expectedC = 512;
        double actualC = Mathematics.formula9(2);
        double delta = 0;
        AssertWrapper.assertEquals(status, expectedC, actualC, delta);
    }
}
