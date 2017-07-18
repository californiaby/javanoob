package com.bakulin.leet;

public class RemoveDupsSortedArray {
	
	public int removeDuplicates(int[] nums) {
		if (nums.length < 2) return 0;
		int i = 1;
		for (int n : nums) {
			if (i == 0 || n > nums[i-1]) {
				nums[i++] = n;
			}
		}
        
        return i;
    }
	
	// 0 1 2 3 3 4 4 5
	//       s e
	// 0 1 2 3

}
