package com;

public class DemoTest4 {
	static void dis1() throws Exception{
		int a=10/0;
		System.out.println("dis1() method");
	}
	static void dis2() throws Exception{
		//try {
		dis1();
	//	}catch(Exception e) {}
		System.out.println("dis2() method");
	}
	public static void main(String[] args) {
		try {
		dis2();
		}catch(Exception e) {}
	System.out.println("Main method");
	}

}
