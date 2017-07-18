package com.bakulin.leet;

public class RotateArray {
	
	/**
	 *  (1, 2, 3, 4, 5), 3 > rotate (1, 2) > rotate (3, 4, 5) > rotate result
	 *  Get (2, 1) + (5, 4, 3), rotated as (3, 4, 5, 1, 2) 
	 */
	public void rotate(int[] nums, int k) {
		k = k % nums.length;
		reverse(nums, 0, nums.length - k - 1);
		reverse(nums, nums.length - k, nums.length - 1);
		reverse(nums, 0, nums.length - 1);
	}
	
	private void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
