package com.bakulin.leet;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlattenArrayTest {

	@Test
	public void test() {
		Object[] ar = new Object[] {1, 2};
		Object[] array = new Object[] {ar, 3};
		new FlattenArray().flatten(array);
	}

}
