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
        int aSize = 0;
        int bSize = 0;
        if (a != null) {
            aSize = a.length;
        }
        if (b != null) {
            bSize = b.length;
        }
        Object[] result = new Object[aSize + bSize];
        if (a != null) {
            System.arraycopy(a, 0, result, 0, aSize);
        }
        if (b != null) {
            System.arraycopy(b, 0, result, aSize, bSize);
        }
        return result;
    }
}
