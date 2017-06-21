package com.bakulin.leet;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bakulin.support.ListNode;

public class MergeTwoListsTest {

	@Test
	public void test() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(5);
		l1.next = new ListNode(8);
		
		ListNode l2 = new ListNode(6);
		l2.next = new ListNode(7);
		
		ListNode merged = new MergeTwoLists().mergeTwoLists(l1, l2);
	}

}
