package com;

public class DemoTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t = Thread.currentThread();
System.out.println(t);
String name = t.getName();
System.out.println("Name is "+name);
t.setName("My Demo Thread");
int i = t.getPriority();
System.out.println("Priority is "+i);
t.setPriority(2);
System.out.println(t);
	}

}
