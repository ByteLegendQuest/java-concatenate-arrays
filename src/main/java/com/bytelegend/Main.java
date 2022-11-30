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
        Object[] newArray = new Object[a.length + b.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            String s = a[i].toString();
            newArray[index] = a[i];
            index++;
        }
        for (int i = 0; i < b.length; i++) {
            newArray[index] = b[i];
            index++;
        }
        return newArray;
    }
}
