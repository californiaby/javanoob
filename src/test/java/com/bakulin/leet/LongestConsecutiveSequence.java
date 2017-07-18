package com.bakulin.leet;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	
	public int longestConsecutive(int[] nums) {
		if (nums.length < 1) return nums.length;
		
		HashSet<Integer> set = new HashSet<>();
		int max = 1;
		
		// Store each number in set
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		
		// Iterate over array
		for (int i = 0; i < nums.length; i++) {
			// Track and left
			int left = nums[i] - 1;
			int right = nums[i] + 1;
			int count = 1;
			
			// Check if left and right can be extended. Remove if they can - we
			// don't want them to be processed again
			while (set.contains(left)) {
				count++;
				set.remove(left);
				left--;
			}
			while (set.contains(right)) {
				count++;
				set.remove(right);
				right++;
			}
			max = Math.max(max, count);
		}
		
        return max;
    }

}
