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
        Object[] objects = new Object[len];
        System.arraycopy(a, 0, objects, 0, a.length);
        int alen = a.length;
        for (Object o : b) {
            objects[alen] = o;
            alen++;
        }
        return objects;
    }
}
