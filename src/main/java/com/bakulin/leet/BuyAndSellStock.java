package com.bakulin.leet;

public class BuyAndSellStock {
	
	public int maxProfit(int[] prices){
		int diff = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			} else {
				if (diff < prices[i] - min) diff = prices[i] - min; 
			} 
		}
		return diff;
	}

}
