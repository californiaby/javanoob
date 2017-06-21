package com.bakulin.leet;

public class StringProblems {
	
	public String reverseStringIterative(String s) {
//		StringBuilder sb = new StringBuilder();
//		char[] stChars = s.toCharArray();
//		for (int i = s.length()-1; i >= 0; i--) {
//			sb.append(stChars[i]);
//		}
//		return sb.toString();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length / 2; i++) {
			char temp = c[i];
			c[i] = c[c.length - 1 - i];
			c[c.length - 1 - i] = temp;
		}
		return String.valueOf(c);		// Please note, c.toString() does not work 
	}
	
	public String reverseStringRecursive(String s) {
		if (s.length() < 2) {
			return s;
		}
		return reverseStringRecursive(s.substring(1)) + s.charAt(0);
	}

}
