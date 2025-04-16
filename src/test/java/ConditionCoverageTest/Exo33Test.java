package ConditionCoverageTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.BinarySearch;

public class Exo33Test {

    @Test
    public void testBinarySearchElementFound() {
        int[] array = {1, 3, 5, 7, 9};
        int result = BinarySearch.binarySearch(array, 5);
        assertEquals(2, result); // condition "array[mid] == element"
    }

    @Test
    public void testBinarySearchElementGreaterThanMid() {
        int[] array = {1, 3, 5, 7, 9};
        int result = BinarySearch.binarySearch(array, 7);
        assertEquals(3, result); // condition "array[mid] <= element", low = mid + 1
    }

    @Test
    public void testBinarySearchElementLessThanMid() {
        int[] array = {1, 3, 5, 7, 9};
        int result = BinarySearch.binarySearch(array, 3);
        assertEquals(1, result); // condition "array[mid] > element", high = mid - 1
    }

    @Test
    public void testBinarySearchElementNotFound() {
        int[] array = {1, 3, 5, 7, 9};
        int result = BinarySearch.binarySearch(array, 4);
        assertEquals(-1, result); // condition "array[mid] != element", recherche échouée
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
