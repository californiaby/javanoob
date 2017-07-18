package com.bakulin.leet;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time. push(x) -- Push element x onto stack. pop() --
 * Removes the element on top of the stack. top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */
public class MinStack {
	
	Node head;
    
    public void push(int x) {
        if (head == null) {
        	head = new Node(x, x);
        } else {
        	Node newHead = new Node(x, Math.min(x, head.min));
        	newHead.next = head;
        	head = newHead;
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
    
    private class Node {
    	int val;
    	int min;
    	Node next;
    	
    	private Node(int val, int min) {
    		this.val = val;
    		this.min = min;
    	}    	
    }
}
