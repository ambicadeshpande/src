public class Fibonacci {
    public static int fibonacciRecur(int n) {
        if (n <= 1) return n;
        else return fibonacciRecur(n-1) + fibonacciRecur(n-2);
    }
    public static int fibonacciOptimized(int n) {
        int n1 = 0 , n2 = 1, sum;
        if (n == 0) {
            return n1;
        }
        for(int i = 2; i <= n; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return n2;
    }
}
