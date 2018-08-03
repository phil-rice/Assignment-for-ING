package com.main.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.main.java.NumberPrint;

public class NumberPrintTest {

	NumberPrint nm = new NumberPrint();
	
	@Test
	public void test() {
	
			    assertEquals("12345678910", nm.numbers());
			}

}
