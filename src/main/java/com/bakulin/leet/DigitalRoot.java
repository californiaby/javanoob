package com.bakulin.leet;

public class DigitalRoot {
	
	public int calculate(int n) {
		while (n > 9) {
			n = n / 10 + n % 10;
		} 
		return n;
	}

}
