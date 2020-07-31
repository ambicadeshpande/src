import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.jupiter.api.Assertions.*;

/* Reads an integer and prints n! = 1 * 2 * ... * n to standard output
   For eg: 0! = 1, 1! = 1, 2! = 2 * 1 = 2, 3! = 3 * 2 * 1 = 6 ..  so on
   Remarks
    - There would be an overflow for long if n > 20
    (Factorial for 21 will give you -> -4249290049419214848 which is incorrect)
*/
public class Factorial {
    // Return n!
    public static long factorialUsingRecursion(long n) {
        if (n < 0) {
            throw new RuntimeException("Underflow error in factorial");
        }
        else if (n > 20) {
            throw new RuntimeException("Overflow error in factorial");
        }
        else if (n == 0) {
            return 1;
        } else {
            return n * factorialUsingRecursion(n - 1);
        }
    }

    @Test
    public void factorialForAnyNumTest() {
        long num = 4;
        long actual = factorialUsingRecursion(num);
        long expected = 24;
        assertEquals(actual, expected);
        System.out.println("factorialForAnyNumTest - passed");
    }

    @Test
    public void factorialForZeroTest() {
        long numZero = 0;
        long actual = factorialUsingRecursion(numZero);
        long expected = 1;
        assertEquals(actual, expected);
        System.out.println("factorialForZeroTest - passed");
    }

    @Test
    public void factorialForAnyLessThan20() {
        long num = -10;
        Exception exception = assertThrows(RuntimeException.class, () -> {
            factorialUsingRecursion(num);
        });
        String expectedMessage = "Underflow error in factorial";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
        System.out.println("factorialForAnyLessThan20 - passed");
    }

    @Test
    public void factorialForAnyGreaterThan20() {
        long num = 22;
        Exception exception = assertThrows(RuntimeException.class, () -> {
            factorialUsingRecursion(num);
        });
        String expectedMessage = "Overflow error in factorial";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
        System.out.println("factorialForAnyGreaterThan20 - passed");
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Factorial.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}
