import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EuclidTest extends Euclid {

    @Test
    public void oneOfTheNumberAsZero() {
        int actual = gcd(10, 0);
        int expected = 10;
        assertEquals(actual, expected);
    }

    @Test
    public void oneOfTheNumberAsZeroUsingRecur() {
        int actual = gcdRecursive(0, 250);
        int expected = 250;
        assertEquals(actual, expected);
    }

    @Test
    public void pGreaterThanQ() {
        int actual = gcd(56, 12);
        int expected = 4;
        assertEquals(actual, expected);
    }

    @Test
    public void qGreaterThanPRecur() {
        int actual = gcdRecursive(8, 400);
        int expected = 8;
        assertEquals(actual, expected);
    }

    @Test
    public void gcdOFTwoNumbersUsingRecur() {
        int actual = gcdRecursive(1701, 3768);
        int expected = 3;
        assertEquals(actual, expected);
    }

    @Test
    public void gcdForTwoNumbersIsOne() {
        int actual = gcdRecursive(17, 21);
        int expected = 1;
        assertEquals(actual, expected);
    }
}
