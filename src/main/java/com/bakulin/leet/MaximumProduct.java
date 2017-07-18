package com.bakulin.leet;

import java.util.ArrayList;
import java.util.Date;
import java.util.Queue;

public class MaximumProduct {

	public int maxProduct(int[] arr) {
		/*
		 * Brute force: sort array, return top three. O(n^2)
		*/
		
		/*
		 * Faster solution.
		 * Create data structure to store top 3. Sorted
		 * Go through array and add new number to top structure only if number is bigger.
		*/
		
		/*
		 * Keep in mind, min1 * min2 * max1 can be bigger than max1 * max2 * max3
		 */

		// Check if arr is 3 or less symbols.
		if (arr.length <= 3) {return 0;}
		
		int min1 = Integer.MIN_VALUE;
		int min2 = Integer.MIN_VALUE;
		int max1 = Integer.MAX_VALUE;
		int max2 = Integer.MAX_VALUE;
		int max3 = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
		}
		
		return 0;
	}

}
