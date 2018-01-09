package com.cirkus.sandbox;

public class AspectJTestHarness {
	
	public void printString(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		AspectJTestHarness test = new AspectJTestHarness();
		test.printString("bla");
		test.printString(null);
	
	}

}
