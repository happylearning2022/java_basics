package com.javaProgram;

public class ConstructerOverLoad {
	
	public ConstructerOverLoad() {
		
		System.out.println("constructer with no params");
	}
	
	 ConstructerOverLoad(String s) {
		this();
		System.out.println("Construter with string params s "+s);
	}
	 
	 ConstructerOverLoad(int a) {
		this("XYZ");
		System.out.println("constructer with int params a "+a);
	}

	 
	 ConstructerOverLoad(double d) {
		//this(2);
		 this();
		System.out.println("Construter with string params s "+d);
	}

	public static void main(String[] args) {
		ConstructerOverLoad n = new ConstructerOverLoad("VVV");

	}

}
