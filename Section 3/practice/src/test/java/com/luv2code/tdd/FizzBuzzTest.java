package com.luv2code.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {
    @DisplayName("Divisible By Three")
    @Test
    @Order(1)
    void testForDivisibleByThree(){
        String expected = "Fizz";
        assertEquals(expected,FizzBuzz.compute(3),"Should return Fizz");
    }

    @DisplayName("Divisible By Five")
    @Test
    @Order(2)
    public void testForDivisibleByFive(){
        String expected= "Buzz";
        assertEquals(expected,FizzBuzz.compute(5),"Should return Buzz");
    }

    @DisplayName("Divisible By Three and Five")
    @Test
    @Order(3)
    public void testDivisibleByThreeAndFive(){
        String expected = "FizzBuzz";
        assertEquals(expected,FizzBuzz.compute(15),"Should return FizzBuzz");
    }
}

