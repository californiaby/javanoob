package com.bakulin.leet;

import com.bakulin.support.ListNode;

public class ReverseLinkedList {
	
	public ListNode reverse(ListNode list) {
		
		// Reverse of empty list is null
		if (list == null) {return null;}
		
		// Reverse of single item list is itself
		if (list.next == null) {return list;}
		
		// Reverse of n element list? Reverse of 2nd element, followed fy 1st
		ListNode second = list.next;
		
		// Unlinking from original list
		list.next = null;
		
		// Recursion for same starting with 2nd element
		ListNode reverseRest = reverse(second);
		
		// And join back the 1st element of original list to 2+ reverse list
		second.next = list;
		
		return reverseRest;
	}

}
