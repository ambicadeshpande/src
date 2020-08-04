import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest extends Fibonacci{

    @Test
    public void fibonacciOf0Is0() {
        int actual = fibonacciRecur(0);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void fibonacciOf1Is1() {
        int actual = fibonacciRecur(1);
        int expected = 1 ;
        assertEquals(actual, expected);
    }

    @Test
    public void LargestNWithoutIntOverflow() {
        int actual = fibonacciRecur(46);
        int expected = 1836311903;
        assertEquals(actual, expected);
    }
    
    @Test
    public void fibonacciOfNOptimized() {
        int actual = fibonacciOptimized(15);
        int expected = 610 ;
        assertEquals(actual, expected);
    }

    @Test
    public void LargestNOptimized() {
        int actual = fibonacciOptimized(46);
        int expected = 1836311903 ;
        assertEquals(actual, expected);
    }
}
