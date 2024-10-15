package com.javaProgram;

public class StaticAndNonStatic {
	static int a;
	int s;
	public static void test1() {
		a=1; 
		System.out.println("static method");
	}

	public static void test2(StaticAndNonStatic s) {
		a=3;
		s.s=567;
		System.out.println("static method2");
	}
	
	public void test3() {
		a=36;
		s=38;
		System.out.println("static method3");
	}
	
	public void test4() {
		s=5;
		a=35466;
			System.out.println("static method4");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		System.out.println("a="+a);
		StaticAndNonStatic s= new StaticAndNonStatic();
		test2(s);
		System.out.println("a="+a);
		
		s.test3();
		System.out.println("a="+s.s);
		System.out.println("a="+a);
		s.test4();
		System.out.println("a="+a);
		
	}

}
