package com;

@FunctionalInterface
interface Operation {
	int add(int x, int y);
}
interface EmployeeInfo{
	float calBonus(int empId,String name, float salary,String desg);
}
public class LambdaExpression {
	public static void main(String[] args) {
		Operation op1 = (x,y)->x+y;		//lambda expression by default return value. 
		System.out.println(op1.add(1, 2));
		Operation op2 = (a,b)->a+b;
		System.out.println(op2.add(3, 4));
		Operation op3 = (int x, int y)->x+y;
		System.out.println(op3.add(5, 6));
		Operation op4 = (x,y)-> {
								int sum = x+y;
								
								return sum;
						};
		System.out.println(op4.add(10, 20));
		
		EmployeeInfo emp1 = (id,name,salary,desg)->{
			if(desg.equals("Manager")) {
				return salary+5000;
			}else if(desg.equals("Programmer")) {
				return salary+3000;
			}else {
				return salary+1000;
			}
		};
		
		System.out.println(emp1.calBonus(1, "Raj", 45000, "Manager"));
		System.out.println(emp1.calBonus(2, "Ravi", 25000, "Programmer"));
		System.out.println(emp1.calBonus(3, "Ramesh", 15000, "Tester"));
	}

}
