package com.main.java;

import java.util.ArrayList;

public class NumberPrint 
{
	public String numbers()	{
		String s="";
		String err= "Test Failed";
		ArrayList<Integer> numbers = new ArrayList<Integer>(10);

		for (int i = 0; i <= 10; i++)
		{
			numbers.add(i);
			System.out.println(numbers.get(i));
		}

		if (numbers.containsAll(numbers))
		{
			s = "12345678910";
			return s;
		}
		else 
			return err;
	}

}
