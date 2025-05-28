package com.learn.leetcode.easy;

public class Palindrome {

	public Boolean isPalindrome(int i) {
		String s = String.valueOf(i);
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return s.equalsIgnoreCase(sb.toString());
	}

}
