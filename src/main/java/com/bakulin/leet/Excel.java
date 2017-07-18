package com.bakulin.leet;

public class Excel {

	public String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			n--;
			int offset = n % 26;
			char letter = (char)('A' + offset);
			sb.insert(0, letter);
			n /= 26;
		}
		return sb.toString();
	}
	
	public int titleToNumber(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			int number = (int)letter - 64;
			result = result * 26 + number;
		}
    
		return result;
    }

}
