package eu.javaspecialists.performance.managedblocker;

import java.math.*;

// TODO: Sign up to Heinz's Newsletter: www.javaspecialists.eu
public class Fibonacci {
    public BigInteger f(int n) {
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;
        return f(n - 1).add(f(n - 2));
    }
}
