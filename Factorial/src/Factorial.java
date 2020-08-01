import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.jupiter.api.Assertions.*;

public class Factorial {
    public static long factorialUsingRecursion(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("Underflow error in factorial");
        }
        else if (n > 20) {
            throw new IllegalArgumentException("Overflow error in factorial");
        }
        else if (n == 0) {
            return 1;
        } else {
            return n * factorialUsingRecursion(n - 1);
        }
    }

    @Test
    public void factorialForAnyNumber() {
        long actual = factorialUsingRecursion(4);
        long expected = 24;
        assertEquals(actual, expected);
    }

    @Test
    public void factorialForZero() {
        long actual = factorialUsingRecursion(0);
        long expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldThrowExceptionNumberLessThan20() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factorialUsingRecursion(-10);
        });
        String expectedMessage = "Underflow error in factorial";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void shouldThrowExceptionNumberGreaterThan20() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factorialUsingRecursion(22);
        });
        String expectedMessage = "Overflow error in factorial";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
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
