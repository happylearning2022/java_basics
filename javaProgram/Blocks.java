package com.javaProgram;

public class Blocks {
	
	static String s;
	//Blocks in java
	//static block
	
	static
	{
		System.out.println("static block");
	}

	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println("i am not a "+s);
		System.out.println("main ends");

	}
	static
	{
	s="robot";
		System.out.println("static block2");
		
	}
	static
	{
		System.out.println("static block3");
	}
	

}
