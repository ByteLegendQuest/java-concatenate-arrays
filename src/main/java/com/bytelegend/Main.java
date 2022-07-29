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
        int n1 = a.length, n2 = b.length, idx = 0;
        Object[] ans = new Object[n1 + n2];
        for (Object o : a) {
            ans[idx++] = o;
        }
        for (Object o : b) {
            ans[idx++] = o;
        }
        return ans;
    }
}
