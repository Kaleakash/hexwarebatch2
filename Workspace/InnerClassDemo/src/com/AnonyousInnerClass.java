package com;
@FunctionalInterface
interface A {
	void dis1();
}
//1st options 
class B implements A {
	public void dis1() {
		System.out.println("A interface method");
	}
}
public class AnonyousInnerClass {
	public static void main(String[] args) {
	A obj1 = new B();
	obj1.dis1();
	
	//2nd Options - Anonymous inner class 
	
	A obj2 =new A() {
		public void dis1() {
			System.out.println("A interface method override by anonymous Inner class");
		}
	};
	obj2.dis1();
	// 3rd options - Anonymous functions 
   A obj3 = 	()->System.out.println("Welcome to Lambda Expression");
   obj3.dis1();
	}

}
