package com.bakulin.leet;

public class Stack {
	
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	public Stack(int s) {
		maxSize = s;
		stackArray = new int[s];
		top = -1;
	}
	
	public void push(int number) {
		stackArray[++top] = number;
	}
	
	public int pop() {
		return stackArray[top--];
	}
	
	public int peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize - 1);
	}

}
