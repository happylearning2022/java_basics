package com.javaProgram;

public class UseOfConstructor {
	
	String name;
	int age;
	String Subject;
	
	public UseOfConstructor(String s,int a,String sub) {
		
		name = s;
		age = a;
		Subject =sub;
	}
	
	public void displayinfo() {
		System.out.println("Name="+name+",age="+age+",Subject="+Subject);
	}
	

	}


