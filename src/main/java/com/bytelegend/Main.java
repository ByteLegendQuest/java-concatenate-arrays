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
        int len = a.length + b.length;
        Object[] temp = new Object[len];
        for (int i = 0; i < a.length; i++) {
        temp[i] = a[i];
        }
        for (int i = a.length, j = 0; i < len; i++, j++) {
        temp[i] = b[j];
        }
        return temp;
    }
}
