public class Euclid {
    public static int gcd (int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }
    public static int gcdRecursive(int p, int q) {
        if (q == 0) {
            return p;
        } else {
            return gcdRecursive(q, p%q);
        }
    }
}
