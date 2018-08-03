package com.main.test;

import org.junit.Assert;
import org.junit.Test;
import com.main.java.SubList;

public class SubListTest {

	SubList sb =new SubList();

	@Test
	public void test() {
		Assert.assertTrue("pass", sb.listCompare());

	}
}
