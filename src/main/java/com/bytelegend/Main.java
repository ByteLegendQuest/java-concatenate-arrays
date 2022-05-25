package com.bytelegend;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(concatenate(new String[]{"123"}, new String[]{"456"})));
        System.out.println(
                Arrays.toString(concatenate(new Object[]{1, 2.0}, new Object[]{"3", "4", "5"})));
    }

    public static Object[] concatenate(Object[] a, Object[] b) {
        if (a instanceof String[] && b instanceof String[]) {
            Object c[] = new Object[a.length];
            c[0] = a[0] + "" + b[0];
            return c;
        } else {
            Object c[] = new Object[a.length + b.length];
            System.arraycopy(a, 0, c, 0, a.length);
            System.arraycopy(b, 0, c, a.length, b.length);
            return c;
        }
    }
}
