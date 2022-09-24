package com.bytelegend;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(concatenate(new String[] {"123"}, new String[] {"456"})));
        System.out.println(
                Arrays.toString(concatenate(new Object[] {1, 2.0}, new Object[] {"3", "4", "5"})));
    }

    public static Object[] concatenate(Object[] a, Object[] b) {
        if (a == null || a.length == 0) {
            return b;
        }
        if (b == null || b.length == 0) {
            return a;
        }
        Object[] c = new Object[a.length + b.length];
        int i = 0;
        for (Object o : a) {
            c[i] = a[i];
            i++;
        }
        for (Object o : b) {
            c[i] = b[i - a.length];
            i++;
        }
        return c;
    }
}
