package com.bakulin.leet;

import org.junit.Test;
import com.bakulin.support.ListNode;

public class MyLinkedListTest {

	@Test
	public void test() {
		ListNode list = new ListNode(1);
		list.next = new ListNode(2);
		list.next.next = new ListNode(0);
		list.next.next.next = new ListNode(1);
		list.next.next.next.next = new ListNode(5);
		
		new MyLinkedList().deleteDups(list);
		System.out.println(list.toString(list));
	}
	
	@Test
	public void testPartition() {
		ListNode list = new ListNode(1);
		list.next = new ListNode(2);
		list.next.next = new ListNode(0);
		list.next.next.next = new ListNode(1);
		list.next.next.next.next = new ListNode(5);
		
		list = new MyLinkedList().partition(list, 2);
		System.out.println(list.toString(list));
	}
	
	@Test
	public void testReturnDuplicates() {
		ListNode list = new ListNode(1);
		list.next = new ListNode(2);
		list.next.next = new ListNode(1);
		list.next.next.next = new ListNode(5);
		
		list = new MyLinkedList().returnDuplicates(list);
		System.out.println(list.toString(list));
	}

}
