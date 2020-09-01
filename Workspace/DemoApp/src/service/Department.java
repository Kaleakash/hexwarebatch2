package service;

import bean.Employee;

public class Department {

	public void empInfo() {
		Employee emp  = new Employee();
		
		//System.out.println("Id "+emp.id);			//private 
				//System.out.println("Name "+emp.name); //default 
				//System.out.println("Salary "+emp.salary);		//protected 
				System.out.println("Age "+emp.age);		//public 
	}
}
