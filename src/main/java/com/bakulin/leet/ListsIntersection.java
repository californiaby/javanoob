package com.bakulin.leet;

import com.bakulin.support.ListNode;

public class ListsIntersection {
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		
		if (headA == null || headB == null) return null;
		
		ListNode startA = headA;
		ListNode startB = headB;
		int lengthA = 1;
		int lengthB = 1;
		
		while (headA.next != null) {
			headA = headA.next;
			lengthA++;
		}
		while (headB.next != null) {
			headB = headB.next;
			lengthB++;
		}
		if (headA != headB) return null;
		int diff = Math.abs(lengthA - lengthB);
		ListNode longer;
		ListNode shorter;
		if (lengthA > lengthB) {
			longer = startA;
			shorter = startB;
		} else {
			longer = startB;
			shorter = startA;
		}
		for (int i = 0; i < diff; i++) {
			longer = longer.next;
		}
		while (longer != shorter) {
			longer = longer.next;
			shorter = shorter.next;
		}
		return longer;
	}
}
