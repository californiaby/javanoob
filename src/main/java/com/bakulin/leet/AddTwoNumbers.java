package com.bakulin.leet;

import com.bakulin.support.ListNode;

public class AddTwoNumbers {
	
	/*
	 * You are given two non-empty linked lists representing two non-negative
	 * integers. The digits are stored in reverse order and each of their nodes
	 * contain a single digit. Add the two numbers and return it as a linked
	 * list. You may assume the two numbers do not contain any leading zero,
	 * except the number 0 itself. 
	 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) 
	 * Output: 7 -> 0 -> 8
	 */
	
	/*
	 * Solution: as 1st element is last digits, simple iterate through both
	 * lists, sum numbers and if >9 move reminder to next sum
	 */
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		// 1 2 3
		// 1 2
		// 2 4 3
		
		if (l1 == null) return l2;
		if (l2 == null) return l1;
		
		int carry = 0;
		ListNode answer = new ListNode(0);
		ListNode start = answer;
		
		while (l1 != null || l2 != null) {
			int x = (l1 != null) ? l1.val : 0;
			int y = (l2 != null) ? l2.val : 0;
			int sum = x + y + carry;
			carry = sum / 10;
			answer.next = new ListNode(sum % 10);
			answer = answer.next;
			if (l1 != null) l1 = l1.next;
			if (l2 != null) l2 = l2.next;
		}
		if (carry > 0) answer.next = new ListNode(carry);
		answer = start;
		return answer.next;
    }

}
