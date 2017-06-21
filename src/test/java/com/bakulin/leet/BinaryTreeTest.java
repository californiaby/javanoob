package com.bakulin.leet;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bakulin.support.TreeNode;

public class BinaryTreeTest {
	
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
	public void testMaxDepth() {
        int depth = new BinaryTree().maxDepth(root);
        System.out.println(depth);
	}
	
	@Test
	public void testIfSymmetric() {
		System.out.println(new BinaryTree().isSymmetric(root));
	}
	
	@Test
	public void testFindBottomLeftValue() {
		System.out.println(new BinaryTree().findBottomLeftValue(root));
	}
	
	@Test
	public void testLevelOrder() {
		System.out.println(new BinaryTree().levelOrder(root));
	}

}
