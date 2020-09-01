package com;
class MyException extends Exception{
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	public MyException(String msg){
		super(msg);
	}
}
public class DemoTest3 {
	public static void main(String[] args) {
	int age=15;
	try {
		if(age<21) {
			//throw new Exception();
			//throw new ArithmeticException();
			//throw new ArithmeticException("age must be >21");
			//throw new MyException();
			throw new MyException("age must be >21");
		}
	}catch(Exception e) {
		System.out.println("Catch "+e.toString());
	}
	System.out.println("Bye....");
	}
}
