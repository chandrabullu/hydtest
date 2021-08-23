package com.airway.qa;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Ezigo {
	@Test
	public void sum(){
		System.out.println("sum");
		int x=10; 
		int y=20;
		Assert.assertEquals(30, x+y);
	}
	@Test
	public void string(){
		System.out.println("string ");
		String s1="chandra";
		Assert.assertEquals(s1,"chandra");
	}
	
		@Test
		public void sub(){
			System.out.println("sub");
			int x=10; 
			int y=20;
			Assert.assertEquals(10, y-x);
		}
		  
		@Test
		public void mult(){
			System.out.println("multiple ");
			int x=10; 
			int y=20;
			Assert.assertEquals(200, x*y);
		}
		@Test
		public void div(){
			System.out.println("div");
			int x=10; 
			int y=20;
			Assert.assertEquals(2, y/x);
		}

	
	
}
