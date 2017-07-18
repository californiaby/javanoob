package com.bakulin.leet;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompareVersionTest {

	@Test
	public void testCompareVersion() {
		System.out.println(new CompareVersion().compareVersion("1.2.3", "1.2.1"));
		System.out.println(new CompareVersion().compareVersion("1.1", "-1.-1"));
	}

}
