package com.bakulin.leet;

public class Kangaroo {
	
	/**
	 * Two Kangaroos jump in same direction. Do they meet?
	 * @param xA 1st kangaroo starting point
	 * @param vA 1st kangaroo speed
	 * @param xB 2nd kangaroo starting point
	 * @param vB 2nd kangaroo speed
	 * @return true/false
	 */
	
	public boolean doTheyMeet(int xA, int vA, int xB, int vB) {
		if ((xA < xB && vA < vB) || (xA > xB && vA > vB)) {
			return false;
		}
		int xDif = Math.abs(xA - xB);
		int vDif = Math.abs(vA - vB);
		return (xDif % vDif == 0);
	}

}
