package bean;

public class Employee {
private int id;
String name;
protected float salary;
public int age;

public	void display() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
		System.out.println("age is "+age);
	}
}
