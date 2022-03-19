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
        Object[] target = new Object[a.length + b.length];
        System.arraycopy(a,0,target,0,a.length);
        System.arraycopy(b,0,target,a.length,b.length);
        return target;
    }
}
