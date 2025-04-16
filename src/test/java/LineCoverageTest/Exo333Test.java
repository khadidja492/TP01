package LineCoverageTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.BinarySearch;
public class Exo333Test {

    @Test
    public void testBinarySearchElementFound() {
        int[] array = {1, 3, 5, 7, 9};
        int result = BinarySearch.binarySearch(array, 5);
        assertEquals(2, result); // l'élément 5 se trouve à l'indice 2
    }

    @Test
    public void testBinarySearchElementNotFound() {
        int[] array = {1, 3, 5, 7, 9};
        int result = BinarySearch.binarySearch(array, 4);
        assertEquals(-1, result); // l'élément 4 n'est pas dans le tableau
    }

    @Test
    public void testBinarySearchEmptyArray() {
        int[] array = {};
        int result = BinarySearch.binarySearch(array, 5);
        assertEquals(-1, result); // tableau vide, retourne -1
    }

    @Test
    public void testBinarySearchNullArray() {
        assertThrows(NullPointerException.class, () -> {
            BinarySearch.binarySearch(null, 5); // exception pour tableau null
        });
    }
}
