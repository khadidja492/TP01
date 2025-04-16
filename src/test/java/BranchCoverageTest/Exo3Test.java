package BranchCoverageTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.BinarySearch;
public class Exo3Test {

    @Test
    public void testBinarySearchElementFound() {
        int[] array = {1, 3, 5, 7, 9};
        int result = BinarySearch.binarySearch(array, 5);
        assertEquals(2, result); // branche "élément trouvé"
    }

    @Test
    public void testBinarySearchElementGreaterThanMid() {
        int[] array = {1, 3, 5, 7, 9};
        int result = BinarySearch.binarySearch(array, 7);
        assertEquals(3, result); // branche "élément > mid, low = mid + 1"
    }

    @Test
    public void testBinarySearchElementLessThanMid() {
        int[] array = {1, 3, 5, 7, 9};
        int result = BinarySearch.binarySearch(array, 3);
        assertEquals(1, result); // branche "élément < mid, high = mid - 1"
    }

    @Test
    public void testBinarySearchElementNotFound() {
        int[] array = {1, 3, 5, 7, 9};
        int result = BinarySearch.binarySearch(array, 4);
        assertEquals(-1, result); // branche "élément non trouvé"
    }

    @Test
    public void testBinarySearchEmptyArray() {
        int[] array = {};
        int result = BinarySearch.binarySearch(array, 5);
        assertEquals(-1, result); // tableau vide
    }

    @Test
    public void testBinarySearchNullArray() {
        assertThrows(NullPointerException.class, () -> {
            BinarySearch.binarySearch(null, 5); // tableau null
        });
    }
}

