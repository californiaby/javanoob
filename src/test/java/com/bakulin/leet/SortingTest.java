package com.bakulin.leet;

import java.util.Arrays;

import org.junit.Test;

public class SortingTest {
	
	@Test
	public void testBubble() {
		int[] unsorted = {6, 4, 8, 1};
		System.out.println(Arrays.toString(unsorted));
		int[] sorted = new Sorting().bubble(unsorted);
		System.out.println(Arrays.toString(sorted));
	}
	
	@Test
	public void testSelection() {
		int[] unsorted = {3, 7, 11, 5, 2, 6, 1};
		System.out.println(Arrays.toString(unsorted));
		int[] sorted = new Sorting().selection(unsorted);
		System.out.println(Arrays.toString(sorted));
	}
	
	@Test
	public void testInsertion() {
		int[] unsorted = {3, 7, 11, 5, 2, 6, 1};
		System.out.println(Arrays.toString(unsorted));
		int[] sorted = new Sorting().insertion(unsorted);
		System.out.println(Arrays.toString(sorted));
	}
	

}
