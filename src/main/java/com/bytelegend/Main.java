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
        int resultLen = a.length + b.length;
        Object[] result = new Object[resultLen];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }
}
