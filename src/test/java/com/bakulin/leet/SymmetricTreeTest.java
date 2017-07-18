package com.bakulin.leet;

import org.junit.Before;
import org.junit.Test;

import com.bakulin.support.TreeNode;
import com.bakulin.leet.SymmetricTree;;

public class SymmetricTreeTest {
	
	static TreeNode symmetric;
	static TreeNode notSymmetric;
	
	@Before
	public void prepare() {
		symmetric = new TreeNode(1);
		symmetric.left = new TreeNode(2);
		symmetric.right= new TreeNode(2);
		symmetric.left.left = new TreeNode(3);
		symmetric.right.right = new TreeNode(3);
		
		notSymmetric = new TreeNode(4);
		notSymmetric.left = new TreeNode(5);
		notSymmetric.right= new TreeNode(5);
		notSymmetric.left.right= new TreeNode(6);
		notSymmetric.right.right= new TreeNode(6);
	}

	@Test
	public void test() {
		System.out.println(new SymmetricTree().isSymmetricRecursive(symmetric));
		System.out.println(new SymmetricTree().isSymmetricRecursive(notSymmetric));
		
		System.out.println(new SymmetricTree().isSymmetricQueue(symmetric));
		System.out.println(new SymmetricTree().isSymmetricQueue(notSymmetric));
	}

}
