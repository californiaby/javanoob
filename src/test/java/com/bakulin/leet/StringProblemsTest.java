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
	public void testReverseRecursive() {
		String s = "good luck";
		System.out.println(new StringProblems().reverseStringRecursive(s));
	}

}
