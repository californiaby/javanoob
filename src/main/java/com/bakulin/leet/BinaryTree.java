package com.bakulin.leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import com.bakulin.support.TreeNode;

public class BinaryTree {
	
	/**
	 * Returns max depth of tree (count of numbers on longest branch).
	 */
	public int maxDepth(TreeNode root) {
		int depth = 1;
		
		if (root == null) {
			return 0;									// If end of branch reached (i.e. current node == null)
		} else {										// For each node recursively
			int left = maxDepth(root.left); 			// Get max depth of left branch 
			int right = maxDepth(root.right);			// Get max depth of right branch
			return depth + Integer.max(left, right);	// Compare and add to depth value
		}
	}
	
	/**
	 * Return bottom left value of the tree (i.e. lowest row, first value left to right).
	 */
	public int findBottomLeftValue(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);								// Add root (1st item)
		while (!queue.isEmpty()) {
			root = queue.poll();						// Poll from queue first item and store as root (i.e. right item)
			if (root.right != null) {
				queue.add(root.right);					// Add right child of polled item
			}
			if (root.left != null) {
				queue.add(root.left);					// Add left child of polled item. It's the last in queue.
			}
		}
		return root.val;
    }

}
