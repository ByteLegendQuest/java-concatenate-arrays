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
        int aLen = a == null ? 0 : a.length;
        int bLen = b == null ? 0 : b.length;
        Object[] arr = new Object[aLen+bLen];

        System.arraycopy(a, 0, arr, 0, aLen);
        System.arraycopy(b, 0, arr, aLen, bLen);

        return arr;
    }
}
