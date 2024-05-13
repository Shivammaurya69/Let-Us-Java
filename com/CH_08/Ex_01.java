package com.CH_08;

public class Ex_01 {
    public static void main(String[] args) {
        int i = -25, j;
        long l = -100000, m;
        double d = -12.34, e;

        j = abs(i);
        m = abs(l);
        e = abs(d);
        System.out.println("j = " + j + " m = " + m + " e = " + e);
    }

    static int abs(int ii) {
        return (ii > 0 ? ii : ii * -1);
    }

    static long abs(long ll) {
        return (ll > 0 ? ll : ll * -1);
    }

    static double abs(double dd) {
        return (dd > 0 ? dd : dd * -1);
    }
}
