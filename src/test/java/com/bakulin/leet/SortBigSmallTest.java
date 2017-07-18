package com.bakulin.leet;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortBigSmallTest {

	@Test
	public void test() {
		int[] ar = new int[] {1, 2, 3, 4, 5};
		System.out.println(SortBigSmall.sort(ar));
	}
	
	@Test
	public void testZero() {
		int[] ar = new int[0];
		System.out.println(SortBigSmall.sort(ar));
	}
	
	@Test
	public void testOne() {
		int[] ar = new int[] {6};
		System.out.println(SortBigSmall.sort(ar));
	}
	
	@Test
	public void testDup() {
		int[] ar = new int[] {1, 2, 1, 2};
		System.out.println(SortBigSmall.sort(ar));
	}

}
