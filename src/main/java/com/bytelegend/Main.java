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
        String[] dd = new String[aa.length + bb.length];
        System.arraycopy(aa, 0, dd, 0, aa.length);
        System.arraycopy(bb, 0, dd, aa.length, bb.length);

        return dd;
    }
}
