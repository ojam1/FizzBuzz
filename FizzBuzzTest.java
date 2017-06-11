package com.ojam1;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by ojam1 on 11/06/2017.
 */
class FizzBuzzTest {

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
            assertEquals("Buzz", FizzBuzz.fizzBuzzer(i));
        }
    }

    @org.junit.jupiter.api.Test
    void containsThree() {
        int[] testValues = {13, 23, 43, 31, 32, 34, 37, 38, 73};
        for (int i : testValues) {
            assertEquals("Fizz", FizzBuzz.fizzBuzzer(i));
        }
    }

    @org.junit.jupiter.api.Test
    void containsFive() {
        int[] testValues = {52, 56, 58, 59, 151, 152, 157};
        for (int i : testValues) {
            assertEquals("Buzz", FizzBuzz.fizzBuzzer(i));
        }
    }

    @org.junit.jupiter.api.Test
    void divisibleByThreeAndFive() {
        int[] testValues = {15, 30, 45, 60};
        for (int i : testValues) {
            assertEquals("FizzBuzz", FizzBuzz.fizzBuzzer(i));
        }
    }

    @org.junit.jupiter.api.Test
    void containsThreeAndFive() {
        int[] testValues = {53,253};
        for (int i : testValues) {
            assertEquals("FizzBuzz", FizzBuzz.fizzBuzzer(i));
        }
    }
}