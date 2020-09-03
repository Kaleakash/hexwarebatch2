package com;
interface A {
	void dis1();
	default void dis2() {
		System.out.println("This A interface default implemation");
	}
	static void dis3() {
		System.out.println("This is A interface static method");
	}
}

class B implements A {
	public void dis1() {
		System.out.println("A interface dis1() method");
	}
}
public class DemoTest {
	public static void main(String[] args) {
		B obj1 = new B();
		obj1.dis1();
		obj1.dis2();
		A.dis3();
	}

}
