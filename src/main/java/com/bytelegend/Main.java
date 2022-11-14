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
        int len1 = a.length;
        int len2 = b.length;
        Object[] result = new Object[len1 + len2];
        for (int x = 0; x < len1; x++)
            result[x] = a[x];
        for (int x = len1; x < len1 + len2; x++)
            result[x] = b[x - len1];
        return result;
    }
}
