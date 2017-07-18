package com.bakulin.leet;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveDupsSortedArrayTest {

	@Test
	public void testRemoveDuplicates() {
		int[] arr = new int[] {1,1,2,2,3,4,4};
		System.out.println(new RemoveDupsSortedArray().removeDuplicates(arr));
	}

}
