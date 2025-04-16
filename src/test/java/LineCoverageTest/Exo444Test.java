package LineCoverageTest;



import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo444Test {

    @Test
    public void testSolveTwoRealRoots() {
        double[] roots = QuadraticEquation.solve(1, -3, 2);
        assertNotNull(roots);
        assertEquals(2, roots.length);
        assertEquals(2.0, roots[0], 0.0001);
        assertEquals(1.0, roots[1], 0.0001);
    }

    @Test
    public void testSolveOneRealRoot() {
        double[] roots = QuadraticEquation.solve(1, -2, 1);
        assertNotNull(roots);
        assertEquals(1, roots.length);
        assertEquals(1.0, roots[0], 0.0001);
    }

    @Test
    public void testSolveNoRealRoot() {
        double[] roots = QuadraticEquation.solve(1, 0, 1);
        assertNull(roots);
    }

    @Test
    public void testSolveAEqualsZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquation.solve(0, 2, 1);
        });
    }
}
