package com.oops.com;

public class ICICI extends RBI {
	

	public void goldloan() {
		System.out.println("gold loan should be 3%");
	}
	
	public static void main(String[] args) {
		ICICI i= new ICICI();
		i.HomeloanIntr();
		i.goldloan();
	
	
	}
}
