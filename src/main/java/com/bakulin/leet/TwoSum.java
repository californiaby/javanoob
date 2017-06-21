package com.bakulin.leet;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {

		int[] answer = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int expectedNumber = target - nums[i];
			
			// Check if map with processed numbers already contains
			// expectedNumber.
			if (map.containsKey(expectedNumber)) {
				answer[1] = i;
				answer[0] = map.get(expectedNumber);
				return answer;
			}
			
			// Store processed numbers in a map. Use number as a key, index as a
			// value.
			map.put(nums[i], i);
		}
		return answer;
	}
}
