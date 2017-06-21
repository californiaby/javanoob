package com.bakulin.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenArray {
	
	public Integer[] flatten(Object[] ar) {
		if (ar == null) {return null;}
		List<Integer> flat = new ArrayList<Integer>();
		for (Object element : ar) {
			if (element instanceof Integer) {
				flat.add((Integer) element);
			} else if (element instanceof Object[]) {
				flat.addAll(Arrays.asList(flatten((Object[]) element)));
			}
		}
		return flat.toArray(new Integer[flat.size()]);
	}
}
