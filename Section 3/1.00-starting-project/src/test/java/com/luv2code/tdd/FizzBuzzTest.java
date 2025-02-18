package com.luv2code.tdd;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {
    // 1. If number divisible by 3 - print Fizz
    @DisplayName("Divisible By Three")
    @Test
    @Order(1)
    void testForDivisibleByThree(){
        String expected = "Fizz";

        assertEquals(expected, FizzBuzz.compute(3),"Should return Fizz");
    }

    // 2. If number divisible by 5 - print Buzz
    @DisplayName("Divisible By Five")
    @Test
    @Order(2)
    void testForDivisibleByFive(){
        String expected = "Buzz";

        assertEquals(expected,FizzBuzz.compute(5), "Should return Buzz");
    }

    // 3. If number divisible by 3 and 5 - print FizzBuzz
    @DisplayName("Divisible By Three and Five")
    @Test
    @Order(3)
    void testForDivisibleByThreeAndFive(){
        String expected = "FizzBuzz";

        assertEquals(expected,FizzBuzz.compute(15), "Should return FizzBuzz");
    }

    // 4. If number not divisible by 3 or 5 - print The Number
    @DisplayName("Not Divisible By Three and Five")
    @Test
    @Order(4)
    void testForNotDivisibleByThreeAndFive(){
        String expected = "1";

        assertEquals(expected,FizzBuzz.compute(1), "Should return 1");
    }

    @DisplayName("Testing with Small data file")
    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources="/small-test-data.csv")
    @Order(5)
    void testForNotDivisibleByThreeAndFive(int value,String expected){
        assertEquals(expected,FizzBuzz.compute(value));
    }

    @DisplayName("Testing with Medium data file")
    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources="/medium-test-data.csv")
    @Order(6)
    void testMediumDataFile(int value,String expected){
        assertEquals(expected,FizzBuzz.compute(value));
    }

    @DisplayName("Testing with Large data file")
    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources="/large-test-data.csv")
    @Order(7)
    void testLargeDataFile(int value,String expected){
        assertEquals(expected,FizzBuzz.compute(value));
    }
}

