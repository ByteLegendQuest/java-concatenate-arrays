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
        int count = a.length + b.length;
        Object[] c = new Object[count];
        for (int i = 0; i < a.length; i++) {
            System.arraycopy(a, i, c, i, 1);
        }
        count = a.length;
        for (int i = 0; i < b.length; i++) {
            System.arraycopy(b, i, c, count + i, 1);
        }
        return c;
    }
}
