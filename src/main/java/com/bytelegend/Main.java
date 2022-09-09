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
        int c = a.length;
        int d = b.length;
        Object[] z = new Object[c + d];
        System.arraycopy(a,0,z,0,c);
        System.arraycopy(b,0,z,c,d);
        return z;
    }
}
