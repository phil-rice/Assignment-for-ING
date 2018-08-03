package com.main.test;

import org.junit.Assert;
import org.junit.Test;

import com.main.java.AreaTriangle;


public class AreaTriangleTest {

	AreaTriangle at = new AreaTriangle();
	@Test
	
	public final void test() {
	
		Assert.assertTrue("pass", at.findArea());
	}

}
