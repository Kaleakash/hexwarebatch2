package bean;

public class Programmer extends Employee{

	public void empInfo() {
		//System.out.println("Id "+id);			//private 
		System.out.println("Name "+name); //default 
		System.out.println("Salary "+salary);		//protected 
		System.out.println("Age "+age);		//public 
	}
}
