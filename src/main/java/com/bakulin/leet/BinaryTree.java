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
	 * Checks if binary tree is a mirror if itself (i.e. symmetric around center). 
	 */
	public boolean isSymmetric(TreeNode root) {
		return (root == null || areChildrenSymmetric(root.left,  root.right));
	}
	
	private boolean areChildrenSymmetric(TreeNode left, TreeNode right) {
		if (left == null || right == null) {			// Check if achieved end of branch
			return  left == right;						// Compare values (or objects) if we did
		}
		if (left.val != right.val) {					// Otherwise check if still symmetric
			return false;								// Return false if not
		}
		// If both checks are not met, got deeper, compare symmetrical pairs
		return areChildrenSymmetric(left.left, right.right) && areChildrenSymmetric(left.right, right.left);
	}
	
	// TODO: implement solution with stack
	public boolean isSymmetricWithStack() {
		return false;
	}
	
	// TODO: implement solution with queue
	public boolean isSymmetricWithQueue() {
		return false;
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
	/**
	 * Return Binary Tree Level Order Traversal
	 */
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		levelHelper(result, root, 0);
		return result;
	}

	private void levelHelper(List<List<Integer>> result, TreeNode root, int height) {
		if (root != null) {
			if (height >= result.size()) {
				result.add(new LinkedList<Integer>());
			}
			result.get(height).add(root.val);
			levelHelper(result, root.left, height+1);
			levelHelper(result, root.right, height+1);
			
		}
	}

}
