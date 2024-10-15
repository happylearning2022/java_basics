package com.javaProgram;

public class NonStaticBlock {
	int a;
	String s;
	//non static
	
	public NonStaticBlock(){
		System.out.println("constructer in java");
	}
	
	
	{
		s="sandy";
		System.out.println("non static block");
	}
	
	{
		System.out.println("non static block2");
	}
	

	public static void main(String[] args) {
		System.out.println("main starts");
		NonStaticBlock n =new NonStaticBlock();
		System.out.println(n.s);
		System.out.println("main ends");

	}

}
