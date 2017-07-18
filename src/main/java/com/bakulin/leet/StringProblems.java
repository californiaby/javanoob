package com.bakulin.leet;

import java.util.Date;

public class StringProblems {
	
	// Reverse String
	// 1. Iterative - go brom beggining to the middle, swap by element
	// 2. StringBuilder - start from beginning, append
	// 3. Stack - build array of chars, then use String.valueof(chars)
	
	public String reverseStringIterative(String s) {
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length / 2; i++) {
			char temp = c[i];
			c[i] = c[c.length - 1 - i];
			c[c.length - 1 - i] = temp;
		}
		return String.valueOf(c);		// Please note, c.toString() does not work 
	}
	
	// Knowing that string is always lowercase latin - have [26] array.
	public boolean isAnagram (String s, String t) {
		if (s.length() != t.length()) return false;
		int[] letters = new int[26];
		for (int i = 0; i < s.length(); i++) {
			letters[s.charAt(i) - 'a']++;
			letters[t.charAt(i) - 'a']--;
		}
		for (int i : letters) {
			if (i != 0) return false;
		}
		return true;
	}
	
	public void stringFormat() {
		System.out.printf("%5d", 12);
		System.out.printf("%5d", 16);
		System.out.println("");
		
		System.out.printf("%5d", 2);
		System.out.printf("%5d", 231);
		System.out.println("");
		
		System.out.printf("%-5d", 2);
		System.out.printf("%-5d", 231);
		System.out.println("");
		
		System.out.printf("%05d", 2);
		System.out.printf("%05d", 231);
		System.out.println("");
		
		System.out.printf("%10tA \n", new Date(1));
		System.out.printf("%2$s \n", 1, "2");
		
		System.out.printf("%25s", "Hello World");
		System.out.println("");
		
		System.out.printf("%-25s", "Hello World");
		System.out.println("");
		
		System.out.printf("%.8s", "Hello World");
		System.out.println("");
		
	}


}
