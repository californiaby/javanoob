package com.bakulin.leet;

import java.util.HashMap;
import java.util.HashSet;

import com.bakulin.support.ListNode;

public class MyLinkedList {

	public void deleteDups(ListNode n) {
		HashSet<Integer> set = new HashSet<>();
		ListNode previous = null;
		while (n != null) {
			if (set.contains(n.val)) {
				previous.next = n.next;
			} else {
				set.add(n.val);
				previous = n;
			}
			n = n.next;
		}
	}

	/**
	 * Given the LinkedList with duplicates, return LinkedList that contains
	 * only duplicates. 1 > 2 > 3 > 2 > 1 converts to 1 > 2 > 2 > 1. Order of
	 * elements doesn't matter.
	 * 
	 * @param n
	 * @return
	 */
	public ListNode returnDuplicates(ListNode n) {
		// Use map to store all nodes, key is node's value and value is counter
		HashMap<Integer, Integer> map = new HashMap<>();

		// Store pointer to initial node
		ListNode first = n;

		// Go through list, record each node's counter
		while (n != null) {
			int number = n.val;
			if (map.containsKey(number)) {
				map.put(number, map.get(number) + 1);
			} else {
				map.put(number, 1);
			}
			n = n.next;
		}

		// Point n to first node again
		n = first;
		ListNode previous = n;
		while (n != null) {
			int number = n.val;
			if (map.get(number) == 1) { // unique
				previous.next = n.next; // link previous to next
			} else { // duplicate
				previous = n; // move previous one node forward
			}
			n = n.next;
		}
		n = first;
		return n;
	}

	public ListNode getKthToLast(ListNode list, int k) {
		ListNode p1 = list;
		ListNode p2 = list;
		// Move p1 k nodes forward
		for (int i = 0; i < k; i++) {
			if (p1.next == null)
				return null;
			p1 = p1.next;
		}
		// Move both counters forward
		while (p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}

	/**
	 * Delete a node in the middle 9i.e. not first or last), goven access to
	 * this node.
	 * 
	 * @param list
	 *            a reference to a non-first node in the linked list
	 * @return true if deleted, false if not
	 */
	public boolean deleteMiddleNode(ListNode list) {
		if (list == null || list.next == null) {
			return false;
		}
		ListNode next = list.next;
		list.val = next.val;
		list.next = next.next;
		return true;
	}

	public ListNode partition(ListNode node, int x) {
		ListNode head = node;
		ListNode tail = node;

		while (node != null) {
			ListNode next = node.next;
			if (node.val < x) {
				// Val is less than X, add to head List
				node.next = head;
				head = node;
			} else {
				// Insert node in tail
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;

		return head;
	}

}
