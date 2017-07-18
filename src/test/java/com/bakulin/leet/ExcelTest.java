package com.bakulin.leet;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExcelTest {

	@Test
	public void testConvertToTitle() {
		System.out.println(new Excel().convertToTitle(3752127));
	}
	
	@Test
	public void testTitleToNumber() {
		System.out.println(new Excel().titleToNumber("HELLO"));
	}

}
