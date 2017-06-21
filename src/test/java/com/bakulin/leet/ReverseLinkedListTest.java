package com.bakulin.leet;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bakulin.support.ListNode;

public class ReverseLinkedListTest {

	@Test
	public void testReverse() {
		ListNode list = new ListNode(1);
		list.next = new ListNode(2);
		list.next.next = new ListNode(3);
		System.out.println(new ReverseLinkedList().reverse(list));
	}

}
