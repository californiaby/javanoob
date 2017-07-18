package com.bakulin.leet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.bakulin.support.TreeNode;

public class BinaryTreeOrderTraversal {
	
	/**
	 * DFS, pre-order, recursive. Pass level + 1.
	 */
	public ArrayList<LinkedList<Integer>> levelOrderDFS(TreeNode root) {
		ArrayList<LinkedList<Integer>> list = new ArrayList<>();
		addNodeToList(root, list, 0);
		return list;
    }

	/**
	 * Adds node's value to the linked list.
	 */
	private void addNodeToList(TreeNode root, ArrayList<LinkedList<Integer>> list, int level) {
		if (root == null) return;
		LinkedList<Integer> currentList = new LinkedList<>();
		if (list.size() <= level) {
			list.add(currentList); 			// if new
		} else {
			currentList = list.get(level); 	// if exists
		}
		currentList.add(root.val);			// add value to the list
		addNodeToList(root.left, list, level + 1);
		addNodeToList(root.right, list, level + 1);
	}
	
	public List<List<TreeNode>> levelOrderBFS(TreeNode root) {
		List<List<TreeNode>> result = new LinkedList<>();
		LinkedList<TreeNode> current = new LinkedList<>();
		current.add(root);
		while (current.size() > 0) {
			result.add(current); // add Queue containing all nodes on current level 
			LinkedList<TreeNode> parents = current; // set current level as parent
			current = new LinkedList<>(); // clear current
			for (TreeNode parent : parents) {
				if (parent.left != null) current.add(parent.left);
				if (parent.right!= null) current.add(parent.right);
			}
		}
		return result;
    }

}