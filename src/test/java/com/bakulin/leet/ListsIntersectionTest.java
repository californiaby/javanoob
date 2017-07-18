package com.bakulin.leet;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bakulin.support.ListNode;

public class ListsIntersectionTest {
	
	ListNode a = new ListNode(1);
	ListNode b = new ListNode(2);
	ListNode c = new ListNode(3);
	ListNode d = new ListNode(4);
	ListNode e = new ListNode(5);
	ListNode f = new ListNode(6);
	
	@Before
	public void setup() {
		// a > b > c >
		//           > d > e
		// 		   f >
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		f.next = d;
	}

	@Test
	public void test() {
		new ListsIntersection().getIntersectionNode(a, f);
	}

}
