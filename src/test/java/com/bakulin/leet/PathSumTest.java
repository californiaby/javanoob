package com.bakulin.leet;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bakulin.support.TreeNode;

public class PathSumTest {
	
	TreeNode root;
	
	@Before
	public void setup() {
		root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(1);
	}

	@Test
	public void test() {
		System.out.println(new PathSum().hasPathSum(root, 22));
		System.out.println(new PathSum().hasPathSum(null, 0));
	}

}
