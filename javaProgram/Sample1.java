package com.javaProgram;

public class Sample1{
//default constructor
	 public Sample1() {
		System.out.println("Default constructer in java");
	 }
	       //parameterized 
	 public Sample1(String s,int a) {
		 System.out.println("parameterized constructer s= "+s+",a="+a);
	}
	
	public static void main(String[] args) {
		System.out.println("main starts");
		Sample1 s= new Sample1();
		Sample1 s2= new Sample1("sandhya",1234);
		System.out.println("main ends");

	}

}
