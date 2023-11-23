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
        Object[] re = new Object[a.length + b.length];
        int i = 0;
        for (Object o : a) {
            re[i++] = o;
        }
        for (Object o : b) {
            re[i++] = o;
        }
        return re;
    }
}
