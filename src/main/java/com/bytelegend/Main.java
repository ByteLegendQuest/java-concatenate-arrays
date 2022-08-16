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

        List<Object> resultlist = new ArrayList<>(a.length + b.length);
        Collections.addAll(resultlist, a);
        Collections.addAll(resultlist, b);

        @SuppressWarnings("unchecked")
        //the type cast is safe as the array1 has the type T[]
        Object[] resultArray = (Object[]) Array.newInstance(a.getClass().getComponentType(), 0);
        return resultlist.toArray(resultArray);
    }
}
