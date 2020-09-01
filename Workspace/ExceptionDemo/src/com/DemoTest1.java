package com;

public class DemoTest1 {

	public static void main(String[] args) {
		System.out.println("Welcome to Java");
		int a=10;
		int b=1;
		int info[]= {1,2,3,4,5};
					try {
					int res = a/b;
					System.out.println("result is "+res);
					int res1 = info[1];
					System.out.println("Result is "+res1);
					System.out.println("No Exception");
					}catch (ArithmeticException e) {
						//System.out.println("I Take Care");
						System.out.println("Arithmetic Exception some task");
					}catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Array Index OutOf Bounds some task");
					}
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");

	}

}
