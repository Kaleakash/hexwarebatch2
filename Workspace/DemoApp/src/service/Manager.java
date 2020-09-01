package service;

import bean.Employee;

public class Manager extends Employee{

		public void displayEmpInfo() {
			//System.out.println("Id "+id);			//private 
			//System.out.println("Name "+name); //default 
			System.out.println("Salary "+salary);		//protected 
			System.out.println("Age "+age);		//public 
		}
}
