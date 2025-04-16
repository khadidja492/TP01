package BranchCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.FizzBuzz;
public class Exo6Test {

    // Test pour un nombre divisible par 3 et 5
    @Test
    public void testFizzBuzzDivisibleBy3And5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15)); // 15 est divisible par 3 et 5
    }

    // Test pour un nombre divisible par 3
    @Test
    public void testFizzDivisibleBy3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9)); // 9 est divisible par 3
    }

    // Test pour un nombre divisible par 5
    @Test
    public void testBuzzDivisibleBy5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10)); // 10 est divisible par 5
    }

    // Test pour un nombre qui n'est pas divisible ni par 3 ni par 5
    @Test
    public void testNumberNotDivisibleBy3Or5() {
        assertEquals("7", FizzBuzz.fizzBuzz(7)); // 7 n'est divisible ni par 3 ni par 5
    }

    // Test pour un nombre inférieur ou égal à 1 (cas d'exception)
    @Test
    public void testInvalidNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(0); // Cas où n <= 1
        });
    }

    // Test pour un nombre égal à 1 (cas d'exception)
    @Test
    public void testInvalidNumberEqualTo1() {
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(1); // Cas où n == 1
        });
    }
}

