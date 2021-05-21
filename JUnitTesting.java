package com.junit.virtusa;

import org.junit.*;
import static org.junit.Assert.*;

public class JUnitTesting {
	
	@Test
	public void setUp() {
	String str="this is my first test case";
	assertEquals("this is my first test case", str);
	}
	
	@Test
	public void testAssertions() {
		String str=new String("Virtusa");
		String str1=new String("Virtusa");
		String str2=null;
		String str3=null;
		String str4="virtusa";
		String str5="virtusa";
		int value1=5;
		int value2=7;
		String[] s1= {"one","two","three"};
		String[] s2= {"one","two","three"};
		assertEquals(str,str1);
		assertTrue(value1 < value2);
		//assertFalse(value1<value2);
		assertNotNull(str4);	
		assertNull(str2);
		
	}

}
