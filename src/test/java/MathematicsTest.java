import org.junit.Assert;
import org.junit.Test;

public class MathematicsTest {

    @Test
    public void testCalculateHypotenuse() {
        double expectedC = 5;
        double actualC = Mathematics.calculateHypotenuse(3, 4);
        Assert.assertEquals(expectedC, actualC, 0.1);
    }
}
