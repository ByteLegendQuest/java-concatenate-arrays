package com.bytelegend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(concatenate(new String[]{"123"}, new String[]{"456"})));
        System.out.println(
                Arrays.toString(concatenate(new Object[]{1, 2.0}, new Object[]{"3", "4", "5"})));
    }

    public static Object[] concatenate(Object[] a, Object[] b) {
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        return list.toArray();
    }
}
