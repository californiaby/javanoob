package com.bakulin.leet;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringProblemsTest {

	@Test
	public void testReverseIterative() {
		String s = "good luck";
		System.out.println(new StringProblems().reverseStringIterative(s));
	}
	
	@Test
	public void testFormat() {
		new StringProblems().stringFormat();;
	}
	
	@Test
	public void testAnagram() {
		System.out.println(new StringProblems().isAnagram("abc", "bca"));
	}

}
