package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzGameTest {

    @Test
    public void should_return_1_in_number_when_call_1() {
        assertEquals("4", FizzBuzzGame.number(4));
    }

    @Test
    public void should_return_Fizz_in_number_when_call_6() {
        assertEquals("Fizz", FizzBuzzGame.number(6));
    }

    @Test
    public void should_return_Buzz_in_number_when_call_10() {
        assertEquals("Buzz", FizzBuzzGame.number(10));
    }

    @Test
    public void should_return_Whizz_in_number_when_call_28() {
        assertEquals("Whizz", FizzBuzzGame.number(28));
    }

    @Test
    public void should_return_FizzBuzz_in_number_when_call_15() {
        assertEquals("FizzBuzz", FizzBuzzGame.number(15));
    }

    @Test
    public void should_return_FizzWhizz_in_number_when_call_42() {
        assertEquals("FizzWhizz", FizzBuzzGame.number(42));
    }

    @Test
    public void should_return_BuzzWhizz_in_number_when_call_35() {
        assertEquals("BuzzWhizz", FizzBuzzGame.number(35));
    }

    @Test
    public void should_return_FizzBuzzWhizz_in_number_when_call_105() {
        assertEquals("FizzBuzzWhizz", FizzBuzzGame.number(105));
    }

    @Test
    public void should_return_Fizz_in_number_when_call_13() {
        assertEquals("Fizz", FizzBuzzGame.number(13));
    }
}
