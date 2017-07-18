package com.bakulin.leet;

import java.util.LinkedList;
import java.util.Queue;
import com.bakulin.support.TreeNode;

public class SymmetricTree {

	/**
	 * Checks if binary tree is symmetric. Recursive mode. On each cycle
	 * compares children: l.l with r.r and l.r with r.l.
	 */
	public boolean isSymmetricRecursive(TreeNode root) {
		return (root == null || isMirror(root.left, root.right));
	}

	private boolean isMirror(TreeNode left, TreeNode right) {
		if (left == null || right == null) return (left == right);
		if (left.val != right.val) return false;
		return isMirror(left.left, right.right) && isMirror(left.right, right.left);
	}
	
	public boolean isSymmetricQueue(TreeNode root) {
		if (root == null) return true;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root.left);
		q.add(root.right);
		while (!q.isEmpty()) {
			TreeNode l = q.poll();
			TreeNode r = q.poll();
			if (l == null && r == null) continue;
			if (l == null ^ r == null) return false;
			if (l.val != r.val) return false;
			q.add(l.left);
			q.add(r.right);
			q.add(r.left);
			q.add(l.right);
		}
		return true;
	}

}
