package com.bakulin.leet;

import com.bakulin.support.TreeNode;

public class FlattenBinaryTree {
	
	/*
	 * Given a binary tree, flatten it to a linked list in-place.
         1
        / \
       2   5
      / \   \
     3   4   6

The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
	 * */
	
	private TreeNode prev = null;
	
	public void flatten(TreeNode root) {
		if (root == null) return;
		flatten(root.right);
		flatten(root.left);
		root.right = prev;
		root.left = null;
		prev = root;
    }

}
