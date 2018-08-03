package com.main.java;
import java.util.Scanner;

public class AreaTriangle {
	private static Scanner input;

	public boolean findArea() {
		double side1 = 0;
		double side2 = 0;
		double side3 = 0;

		input = new Scanner(System.in);

		System.out.print("Enter three points for a triangle (x and y intercept): ");
		double side1x  = input.nextDouble();
		double side1y  = input.nextDouble();
		double side2x  = input.nextDouble();
		double side2y  = input.nextDouble();
		double side3x  = input.nextDouble();
		double side3y  = input.nextDouble();

		side1 = Math.sqrt(Math.pow((side2x - side1x), 2)+ Math.pow((side2y - side1y), 2));
		side2 = Math.sqrt(Math.pow((side3x - side2x), 2) + Math.pow((side3y - side2y), 2));
		side3 = Math.sqrt(Math.pow((side1x - side3x), 2) + Math.pow((side1y - side3y), 2));

		if((side1+side2)>side3 && (side1+side3)>side2 && (side2+side3)>side1)
		{
			double s = (side1 + side2 + side3) / 2;
			double area = Math.sqrt(s * (s-side1) *(s-side2) *(s-side3));
			System.out.println("Area of the triangle is :" + area);
			return true;
		}
		else
			System.out.println("triangle doesn't exist");
			return false;
			
		
	}    	
}

