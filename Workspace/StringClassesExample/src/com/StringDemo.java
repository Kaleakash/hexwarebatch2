package com;

public class StringDemo {

	public static void main(String[] args) {
		/*String str1="Welcome to Java Training";

		String str2 = new String("Welcome to Java Training");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.charAt(0));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.indexOf('e'));
		System.out.println(str1.lastIndexOf('e'));*/
		/*String name1 = "Raj";				// memory created 
		String name2 = "Raj";				//2 reference and one memory 
												//string pooling 
		String name3 = new String("Raj");		//new memory 
		String name4 = new String("Raj");		//new memory 
		if(name3.equals(name4)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}*/
		String str ="Welcome to Java Training";
		System.out.println(str);
		System.out.println(str.toLowerCase());
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer("Welcome to Java Training");
		System.out.println(sb);
		System.out.println(sb.insert(10, " Again"));
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb);
	}

}
