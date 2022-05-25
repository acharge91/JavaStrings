package com.sparta.ac.palindrome;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {
    public static void main (String [] args) {
        String sentenceToCheck = "the racecar is blue said hannah racecar Level Murdrum";

        printPalindromesInArray(checkEachWord(sentenceToCheck.split(" ")));
    }

    public static void printPalindromesInArray(String[] palindromeArray) {
        for (String word : palindromeArray) {
            System.out.println(word);
        }
    }

    public static String[] checkEachWord(String[] sentenceArray) {
        List<String> longestPalindrome = new ArrayList<String>();
        for (int i = 0; i < sentenceArray.length; i++) {
            if (palindromeCheker(sentenceArray[i]) && sentenceArray[i].length() > 3) {
                if (longestPalindrome.isEmpty()) {
                    longestPalindrome.add(sentenceArray[i]);
                } else if (sentenceArray[i].length() > longestPalindrome.get(0).length()) {
                    longestPalindrome.clear();
                    longestPalindrome.add(sentenceArray[i]);
                } else if (sentenceArray[i].length() == longestPalindrome.get(0).length()) {
                    longestPalindrome.add(sentenceArray[i]);
                }
            }
        }
        return longestPalindrome.toArray(new String[0]);
    }

    private static boolean palindromeCheker(String word) {
        boolean palindromeCheck = new StringBuilder(word.toLowerCase())
                .reverse()
                .toString()
                .equals(word.toLowerCase());

        return palindromeCheck;
    }
}
