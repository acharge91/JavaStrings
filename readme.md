# Java Strings Project

**Palindrome.java**

- A programme that identifies palindromes in a sentence and returns an array of palindromes that have the longest length. The *getLongestPalindromeArray* method splits a sentence on any non-word character using regular expression. It then iterates through the array of words calling the *isPalindromeChecker* method to identify if they are a palindrome and whether they are longer than 2 characters. The *addPalindromeToArray* method then adds all valid palindromes to an ArrayList, if they are same length as any already in the list. If thy are longer, then the ArrayList is cleared and the longer palindrome is added.

**PalindromeTest.java**

- A test file that checks that valid palindromes return true and invalid ones return false and that all checks are case-insensitive. It also tests that valid palindromes are selected from a sentence and that only the largest ones are returned.