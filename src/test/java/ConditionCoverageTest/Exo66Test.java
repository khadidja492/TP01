package ConditionCoverageTest;
import org.example.FizzBuzz;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo66Test {

    @Test
    public void testCondition_nLessThanOrEqualTo1_True() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(1)); // n <= 1 -> true
    }

    @Test
    public void testCondition_nLessThanOrEqualTo1_False() {
        assertDoesNotThrow(() -> FizzBuzz.fizzBuzz(3)); // n <= 1 -> false
    }

    @Test
    public void testCondition_nMod15Equals0_True() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(45)); // n % 15 == 0 -> true
    }

    @Test
    public void testCondition_nMod15Equals0_False() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10)); // n % 15 == 0 -> false
    }

    @Test
    public void testCondition_nMod3Equals0_True() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6)); // n % 3 == 0 -> true
    }

    @Test
    public void testCondition_nMod3Equals0_False() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10)); // n % 3 == 0 -> false
    }

    @Test
    public void testCondition_nMod5Equals0_True() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(20)); // n % 5 == 0 -> true
    }

    @Test
    public void testCondition_nMod5Equals0_False() {
        assertEquals("2", FizzBuzz.fizzBuzz(2)); // n % 5 == 0 -> false
    }
}

