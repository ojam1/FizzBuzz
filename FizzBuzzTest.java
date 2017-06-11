package com.ojam1;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by ojam1 on 11/06/2017.
 */
class FizzBuzzTest {
    @org.junit.jupiter.api.Test
    void fizzBuzzer() {
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzzer(53));
    }
}