package com.learn.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void testPalindromeNumberUsingStringConversion() {
		Palindrome palindrome = new Palindrome();
		assertTrue(palindrome.isPalindromeUsingStringConversion(121));
		assertFalse(palindrome.isPalindromeUsingStringConversion(-121));
		assertFalse(palindrome.isPalindromeUsingStringConversion(10));
		assertTrue(palindrome.isPalindromeUsingStringConversion(0));
		assertTrue(palindrome.isPalindromeUsingStringConversion(1234321));
		assertFalse(palindrome.isPalindromeUsingStringConversion(1234567));
	}
}
