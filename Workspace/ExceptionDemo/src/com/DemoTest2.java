package com;

public class DemoTest2 {

	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			int res =10/0;		// exception generate 
			System.out.println("No Exception");
		}finally {
			System.out.println("finally block");
		}
		System.out.println("Normal Statement");
	}

}
