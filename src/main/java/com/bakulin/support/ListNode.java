package com.bakulin.support;

public class ListNode {
	
	public int val;
	public ListNode next;
	public ListNode (int x) {val = x;}
	
	public String toString(ListNode n){
		String s = "";
		while (n != null) {
			s += (n.val + " ");
			n = n.next;
		}
		return s;
	}
}
