package LineCoverageTest;


import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo666Test {

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15)); // couvre ligne return "FizzBuzz"
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9)); // couvre ligne return "Fizz"
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10)); // couvre ligne return "Buzz"
    }

    @Test
    public void testNumber() {
        assertEquals("7", FizzBuzz.fizzBuzz(7)); // couvre ligne return String.valueOf(n)
    }

    @Test
    public void testInvalid() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(1)); // couvre ligne throw exception
    }
}

