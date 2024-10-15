package com.oops.com;

public class SBI extends RBI {
	
	public void carloan() {
		System.out.println("car loan should be 7%");
	}
	
	public static void main(String[] args) {
		SBI s= new SBI();
		s.HomeloanIntr();
		s.carloan();
		
	}

}
