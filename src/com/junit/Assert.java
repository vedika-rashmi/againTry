package com.junit;





import static org.junit.Assert.*;

import org.junit.Test;

public class Assert {

	@Test
	public void testAssertions() 
	{
		String str=new String("Vedika");
		String str1=new String("Vedika");
		String str2=null;
		String str3="Vedika";
		String str4="Vedika";
		int val=5;
		int val1=6;
		String[] expectedArray= {"one","two","three"};
		String[] resultArray= {"one","two","three"};
		assertEquals(str,str1);
		//check for true
		assertTrue(val<val1);
		//check for false
		assertFalse(val>val1);
		//check for null
		assertNotNull(str);
		//check for not null
		assertNull(str2);
		//check if the reference to same object
		assertSame(str3,str4);
		//not same
		assertNotSame(str1,str);
		assertArrayEquals(expectedArray,resultArray);
		
	}
	
}
