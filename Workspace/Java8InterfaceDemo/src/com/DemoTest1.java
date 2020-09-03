package com;
interface AA {
	void dis1();
	default void dis2() {
		System.out.println("This A interface default implemation");
	}
}

class BB implements AA {
	public void dis1() {
		System.out.println("A interface dis1() method");
	}
	public void dis2() {
		System.out.println("BB class override defaule method provided by AA interface");
	}
}
public class DemoTest1 {
	public static void main(String[] args) {
		BB obj= new BB();
		obj.dis1();
		obj.dis2();
	}

}
