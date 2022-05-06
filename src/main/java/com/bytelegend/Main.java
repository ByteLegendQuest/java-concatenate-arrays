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
        int x = a.length;
        int y = b.length;
        Object[] sc = new Object[x + y];
        System.arraycopy(a, 0, sc, 0, x);
        System.arraycopy(b, 0, sc, x, y);
        return sc;
    }
}
