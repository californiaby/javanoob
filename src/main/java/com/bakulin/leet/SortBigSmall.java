package com.bakulin.leet;

public class SortBigSmall {
	
	public static int[] sort(int[] ar){
		// Handle edge cases
		if (ar == null) return null;
		if (ar.length <= 1) return ar;
		
		// Sort ar in descending order
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = 0; j < ar.length - 1 - i; j++) {
				if (ar[j] < ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		
		// Create new answer and go through sorted ar
		int[] answer = new int[ar.length];
		int pointer = 0;
		for (int i = 0; i < ar.length / 2; i++) {
			answer[pointer++] = ar[i];
			if (i != ar.length - i - 1) {
				answer[pointer++] = ar[ar.length - i - 1];
			}
		}
		
		return answer;
	}
}
