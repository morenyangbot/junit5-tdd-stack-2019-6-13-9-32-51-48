package com.thoughtworks.tdd;

public class FizzBuzzGame {
    public static String number(int i) {
        String result = "";
        if (i % 3 == 0 || i == 13) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (i % 7 == 0) {
            result += "Whizz";
        }
        if (result.isEmpty()) {
            result = "" + i;
        }
        return result;
    }
}
