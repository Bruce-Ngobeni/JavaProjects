import org.junit.Assert;
import org.junit.Test;
import za.co.wethinkcode.FizzBuzz;

import static org.junit.Assert.*;
import za.co.wethinkcode.FizzBuzz;

public class FizzBuzzTest {

    // Test FizzBuzz
    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    // Test Fizz
    @Test
    public void testFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    // Test Buzz
    @Test
    public void testBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }
}
