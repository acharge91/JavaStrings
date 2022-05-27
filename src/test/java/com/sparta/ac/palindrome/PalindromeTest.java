package com.sparta.ac.palindrome;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class PalindromeTest {

    @Test
    @DisplayName("Test racecar returns true")
    void checkPalindromeDowncaseReturnsTrue() {
        Assertions.assertEquals(true, Palindrome.isPalindromeCheker("racecar"));
    }

    @Test
    @DisplayName("Test Hannah returns true")
    void checkPalindromeUpcaseReturnsTrue() {
        Assertions.assertEquals(true, Palindrome.isPalindromeCheker("Hannah"));
    }

    @Test
    @DisplayName("Test racecars returns false")
    void checkNonPalindromeReturnsFalse() {
        Assertions.assertEquals(false, Palindrome.isPalindromeCheker("racecars"));
    }

    @Test
    @DisplayName("Test returns array from sentence")
    void checkSentenceReturnsPalindrome() {
        String stringToTest= "Hannah is a great person";
        String[] arrayExpectedResult = {"Hannah"};
        Assertions.assertArrayEquals(arrayExpectedResult, Palindrome.getLongestPalindromesArray(stringToTest));
    }

    @Test
    @DisplayName("Test returns array with multiple palindromes from sentence")
    void checkSentenceReturnsMultiplePalindromes() {
        String stringToTest= "Hannah degged the plants and got redder";
        String[] arrayExpectedResult = {"Hannah", "degged", "redder"};
        Assertions.assertArrayEquals(arrayExpectedResult, Palindrome.getLongestPalindromesArray(stringToTest));
    }

    @Test
    @DisplayName("Test returns array with longest palindromes from sentence")
    void checkSentenceReturnsLongestPalindromes() {
        String stringToTest= "Hannah degged the plants and got redder. She got in her racecar with murdrum";
        String[] arrayExpectedResult = {"racecar", "murdrum"};
        Assertions.assertArrayEquals(arrayExpectedResult, Palindrome.getLongestPalindromesArray(stringToTest));
    }

    @Test
    @DisplayName("Test returns empty string string if null")
    void checkNullReturnsEmptyString() {
        String[] arrayExpectedResult = {""};
        Assertions.assertArrayEquals(arrayExpectedResult, Palindrome.getLongestPalindromesArray(null));
    }

}
