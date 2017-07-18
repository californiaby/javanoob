package com.bakulin.leet;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bakulin.support.TreeNode;

public class FlattenBinaryTreeTest {
	
	TreeNode tree;

	@Before
	public void createTree() {
		tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(5);
		tree.left.left = new TreeNode(3);
		tree.left.right = new TreeNode(5);
		tree.right.right = new TreeNode(6);
	}
	
	@Test
	public void testFlatten() {
		new FlattenBinaryTree().flatten(tree);
		
	}

}
