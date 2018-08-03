package com.main.java;

import java.util.ArrayList;
import java.util.List;

public class SubList {
	
	public boolean listCompare()	{

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
		if (list1.containsAll(list2))
			return true;
		else 
			return false;

	}		
}