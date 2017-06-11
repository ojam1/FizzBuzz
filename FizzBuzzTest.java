package com.ojam1;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by ojam1 on 11/06/2017.
 */
class FizzBuzzTest {
//    @org.junit.jupiter.api.Test
//    void fizzBuzzer() {
//        assertEquals("FizzBuzz", FizzBuzz.fizzBuzzer(53));
//    }

    @org.junit.jupiter.api.Test
    void divisibleByThree() {
        int[] testValues = {3, 6, 9, 12, 18, 21, 24, 27, 33, 36};
        for (int i : testValues) {
            assertEquals("Fizz", FizzBuzz.fizzBuzzer(i));
        }
    }

    @org.junit.jupiter.api.Test
    void divisibleByFive() {
        int[] testValues = {5, 10, 20, 25, 35, 40, 50, 55};
        for (int i : testValues) {
            assertEquals("Buzz",FizzBuzz.fizzBuzzer(i));
        }
    }

    @org.junit.jupiter.api.Test
    void containsThree()
}