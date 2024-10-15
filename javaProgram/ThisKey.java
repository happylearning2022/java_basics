package com.javaProgram;

public class ThisKey {
	
	String name;
	int age;
	String subject;
	
public ThisKey ( String name,int age,String Subject) {
	
	this.name = name;
	this.age = age;
	this.subject=subject;
	
}

public void displayinfo1() {
	System.out.println("name="+name+",age="+age+", subject="+subject);
}

}
