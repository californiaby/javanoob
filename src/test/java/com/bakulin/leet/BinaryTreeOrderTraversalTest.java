package com.bakulin.leet;


import org.junit.Before;
import org.junit.Test;

import com.bakulin.support.TreeNode;

public class BinaryTreeOrderTraversalTest {
	
TreeNode root;
	
	@Before
	public void setup() {
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.right = new TreeNode(3);
		root.left.left= new TreeNode(4);
	}

	@Test
	public void test() {
		new BinaryTreeOrderTraversal().levelOrderDFS(root);
	}

}
