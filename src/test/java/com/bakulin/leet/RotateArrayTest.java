package com.bakulin.leet;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotateArrayTest {

	@Test
	public void testRotate() {
		int[] nums = new int[] {1, 2, 3, 4};
		new RotateArray().rotate(nums, 3);
	}

}
