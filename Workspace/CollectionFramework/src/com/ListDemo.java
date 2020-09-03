package com;
import java.util.*;
class Employee {

	@Override
	public String toString() {
		return "This is Employee class Object";
	}
	
	
}
class Manager {
	@Override
	public String toString() {
		return "This is Manager  class Object";
	}
}
public class ListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		/*System.out.println("Size "+al.size());
		System.out.println("Empty "+al.isEmpty());
		al.add(10);
		al.add(10.10);
		al.add("Ravi");
		al.add(true);
		Employee emp = new Employee();
		Manager mgr = new Manager();
		al.add(emp);
		al.add(mgr);
		System.out.println("Size "+al.size());
		System.out.println("Empty "+al.isEmpty());
		System.out.println(al);
		System.out.println(emp);*/
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		al.add(1, 100);
		System.out.println(al);
		al.remove(3);								//remove using index position 
		al.remove(new Integer(40));		// remove using value 
		System.out.println(al);
	}

}
