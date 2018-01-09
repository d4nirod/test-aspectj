package com.cirkus.sandbox;

public aspect Aspect {
	pointcut printString(String str):
		if(str != null) && call(* *AspectJTestHarness.printString(String)) && args(str);
	
	Object around(String str) : printString(str) {
		return proceed("[Advised] " + str); 
	}
}
