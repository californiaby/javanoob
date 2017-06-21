package com.bakulin.leet;

import static org.junit.Assert.*;

import org.junit.Test;

public class KangarooTest {

	@Test
	public void test() {
		System.out.println(new Kangaroo().doTheyMeet(0, 5, 10, 10));
		System.out.println(new Kangaroo().doTheyMeet(0, 10, 10, 5));
		System.out.println(new Kangaroo().doTheyMeet(0, 3, 4, 2));
	}

}
