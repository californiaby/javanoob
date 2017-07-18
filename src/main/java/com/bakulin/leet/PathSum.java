package com.bakulin.leet;

import com.bakulin.support.TreeNode;

public class PathSum {
	
	public boolean hasPathSum(TreeNode root, int sum) {
	if (root == null && sum == 0) {
		return true;
	} else if (root != null) {
		int n = root.val;
		return hasPathSum(root.left, sum - n) || hasPathSum (root.right, sum - n);
	}
	return false;
	}

}
