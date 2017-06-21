package com.bakulin.leet;

import com.bakulin.support.ListNode;

public class MergeTwoLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		// Handling edge cases
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}	

		// Create new ListNode for result
		ListNode mergeHead;

		// Check min value, add to mergehead, call same method recursively with
		// next ListNode
		if (l1.val < l2.val) {
			mergeHead = l1;
			mergeHead.next = mergeTwoLists(l1.next, l2);
		} else {
			mergeHead = l2;
			mergeHead.next = mergeTwoLists(l1, l2.next);
		}
		return mergeHead;
	}

}
