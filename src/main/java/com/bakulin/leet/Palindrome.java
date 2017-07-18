package com.bakulin.leet;

import java.util.LinkedList;
import java.util.Stack;

public class Palindrome {

	/**
	 * Given a string, determine if it is a palindrome, considering only
	 * alphanumeric characters and ignoring cases.
	 */
	public boolean isValidPalindromeBruteForce(String s) {
		// Brute force:
		String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		StringBuilder sb = new StringBuilder(actual);
		String rev = sb.reverse().toString();
		return (actual.equals(rev));
	}
	
	/**
	 * Given a string, determine if it is a palindrome, considering only
	 * alphanumeric characters and ignoring cases.
	 */
	public boolean isValidPalindromeTwoPointers(String s) {
		if (s.isEmpty()) {
        	return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
        	cHead = s.charAt(head);
        	cTail = s.charAt(tail);
        	if (!Character.isLetterOrDigit(cHead)) {
        		head++;
        	} else if(!Character.isLetterOrDigit(cTail)) {
        		tail--;
        	} else {
        		if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
        			return false;
        		}
        		head++;
        		tail--;
        	}
        }
        return true;
	}


}
