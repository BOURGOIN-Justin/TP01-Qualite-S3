package com.tpqdev.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void subTest1() {
        int a = 80;
        int b = 12;
        int result = 68;

        int found = Sub.sub(a, b);

        assertEquals(result, found);
    }
}
