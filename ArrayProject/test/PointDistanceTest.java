
import arrayproject.Point;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointDistanceTest {

    private Point source;
    private Point target;
            
    public PointDistanceTest() {
        source = new Point();
        target = new Point();
    }

    @Test
    public void distanceTest() {
        double expected = 1.4242135623730951;
        source.setX(5);
        source.setY(2);
        target.setX(4);
        target.setY(3);
        double actual = source.getDistanceCalculation(target);
        System.out.println("Expected = " + expected);
        System.out.println("Actual = " + actual);
        System.out.println("Delta  = " + (actual - expected));
        assertEquals(expected, actual, 0.1);

    }

}
