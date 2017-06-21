package com.bakulin.leet;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Sorting {

	/**
	 * Bubble sorting algo. Go over array, compare each item with next one. If
	 * unsorted, switch. Run cycle, ignoring first and last pair (already
	 * sorted).
	 */
	public int[] bubble(int ar[]) {
		for (int i = 0; i < ar.length - 1; i++) { 			// Go over array, except for last item
			for (int j = 0; j < ar.length - i - 1; j++) {
				if (ar[j] > ar[j + 1]) { 					// Check each item with next one
					int temp = ar[j]; 						// Switch if necessary
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
		return ar;
	}

	/**
	 * Selection sorting algo.
	 * 
	 */
	public int[] selection(int ar[]) {
		for (int i = 0; i < ar.length - 1; i++) { 		// No need to compare last item
			int min = i; 								// Set 1st item in cycle as min index
			for (int j = i + 1; j < ar.length; j++) { 	// Go over rest of array
				if (ar[j] < ar[min]) 					// Compare each value, < min?
					min = j; 							// If yes, update min's index
			}
			int temp = ar[i]; 							// Once cycle is passed and we know min index
			ar[i] = ar[min]; 							// Switch
			ar[min] = temp;
		} 												// Cycle's min is now OOB, proceed starting with nex
		return ar;
	}

	/**
	 * Insertion algo. Splits array into "sorted" and "unsorted" part. On each
	 * cycle picks a number and defines where to put in "sorted" part, moving
	 * all bigger numbers forward.
	 */
	public int[] insertion(int ar[]) {
		for (int i = 1; i < ar.length; i++) { 		// Go over array starting with 2nd item
			int index = ar[i]; 						// Save last number as index
			int j = i; 								// Go back over "sorted" part
			while (j > 0 && ar[j - 1] > index) {	// If prev number bigger
				ar[j] = ar[j - 1]; 					// Move it forward
				j--;
			}
			ar[j] = index; 							// Once achieved prev is not bigger - insert index
		}
		return ar;
	}

}
