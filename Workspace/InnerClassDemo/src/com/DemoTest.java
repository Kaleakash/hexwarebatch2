package com;

class Outer {
			int a;
			void dis1() {
				System.out.println("This outer class dis1() method");
			}
			class Inner {
				int b;
					void dis1() {
						System.out.println("This inner class dis2() method");
					}
			}
			
}
public class DemoTest {

	public static void main(String[] args) {
	Outer out = new Outer();
	out.dis1();
	
	Outer.Inner in = new Outer().new Inner();		//1 outer and 1 inner 
	Outer.Inner in1 = new Outer().new Inner();	//1 outer and 1 inner 
	
	Outer.Inner in2 = out.new Inner();		// already outer created and 1 inner 
	Outer.Inner in3 = out.new Inner();		//already outer created and 1 inner 
	in.dis1();
	}

}
