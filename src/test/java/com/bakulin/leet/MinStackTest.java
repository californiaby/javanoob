package com.bakulin.leet;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinStackTest {

	@Test
	public void test() {
		MinStack stack = new MinStack();
		stack.push(3);
		stack.push(2);
		stack.push(5);
		stack.push(1);
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
	}

}
