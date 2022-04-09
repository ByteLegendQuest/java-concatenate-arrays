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
        Object[] objects = Arrays.copyOf(a, len1 + len2);
        for (int i = len1, index=0; i < len1 + len2 ; i++) {
            objects[i] = b[index++];
        }
        return objects;

    }
}
