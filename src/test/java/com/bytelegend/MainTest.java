package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class MainTest {
    @Test
    public void test() {
        Assertions.assertArrayEquals(
                new Object[] {1, 2.0, "3", "4", "5"},
                Main.concatenate(new Object[] {1, 2.0}, new Object[] {"3", "4", "5"}));
    }

    @Test
    public void randomTest() {
        int len = new Random().nextInt(10);
        Object[] a = new Object[len];
        Object[] b = new Object[len];
        Arrays.fill(a, 1);
        Arrays.fill(b, 2);

        Object[] result = Main.concatenate(a, b);

        Assertions.assertArrayEquals(Arrays.copyOfRange(result, 0, len), a);
        Assertions.assertArrayEquals(Arrays.copyOfRange(result, len, 2 * len), b);
    }
}
