package com.bakulin.leet;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bakulin.support.ListNode;

public class AddTwoNumbersTest {

	@Test
	public void testAddTwoNumbers() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(2);
		
		new AddTwoNumbers().addTwoNumbers(l1, l2);
	}

}
