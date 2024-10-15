package com.javaProgram;

public class NonStatic {
	
	
	int a;
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object
		NonStatic ns=new NonStatic(); 
		System.out.println("a="+ns.a);
		System.out.println("name ="+ns.name);
		
		NonStatic ns1=new NonStatic(); 
		System.out.println("a="+ns1.a);
		System.out.println("name ="+ns1.name);
		
	}

}
