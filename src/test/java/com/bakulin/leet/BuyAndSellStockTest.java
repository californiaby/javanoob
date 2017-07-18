package com.bakulin.leet;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuyAndSellStockTest {

	@Test
	public void test() {
		int[] prices = new int[] {3, 5, 2, 3};
		System.out.println(new BuyAndSellStock().maxProfit(prices));
	}

}
