package com.learn.leetcode.easy;

public class Palindrome {

	public boolean isPalindromeUsingStringConversion(int i) {
		String s = String.valueOf(i);
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return s.equalsIgnoreCase(sb.toString());
	}
}
