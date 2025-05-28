package com.learn.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void testPalindromeNumber() {
		Palindrome palindrome = new Palindrome();
		assertTrue(palindrome.isPalindrome(121));
		assertFalse(palindrome.isPalindrome(-121));
		assertFalse(palindrome.isPalindrome(10));
		assertTrue(palindrome.isPalindrome(0));
		assertTrue(palindrome.isPalindrome(1234321));
		assertFalse(palindrome.isPalindrome(1234567));
	}
}
