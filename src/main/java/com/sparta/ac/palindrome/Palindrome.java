package com.sparta.ac.palindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {
    public static void main (String [] args) {
        String sentenceToCheck = "Wow, a madam in a honda civic, the Radar went pop on the level.";

        System.out.println(Arrays.toString(getLongestPalindromesArray(sentenceToCheck)));
    }

    public static String[] getLongestPalindromesArray(String sentence) {
        String[] sentenceArray = sentence.split("\\W");
        List<String> longestPalindrome = new ArrayList<String>();
        for (int i = 0; i < sentenceArray.length; i++) {
            if (isPalindromeCheker(sentenceArray[i]) && sentenceArray[i].length() >= 3) {
                addPalindromeToArray(sentenceArray, longestPalindrome, i);
            }
        }
        return longestPalindrome.toArray(new String[0]);
    }

    private static void addPalindromeToArray(String[] sentenceArray, List<String> longestPalindrome, int i) {
        if (longestPalindrome.isEmpty()) {
            longestPalindrome.add(sentenceArray[i]);
        } else if (sentenceArray[i].length() > longestPalindrome.get(0).length()) {
            longestPalindrome.clear();
            longestPalindrome.add(sentenceArray[i]);
        } else if (sentenceArray[i].length() == longestPalindrome.get(0).length()) {
            longestPalindrome.add(sentenceArray[i]);
        }
    }

    public static boolean isPalindromeCheker(String word) {
        boolean palindromeCheck = new StringBuilder(word.toLowerCase())
                .reverse()
                .toString()
                .equals(word.toLowerCase());

        return palindromeCheck;
    }
}
