package com;

import java.util.ArrayList;

public class CollectionGenerics {

	public static void main(String[] args) {
	/*ArrayList al = new ArrayList();
	al.add(10);			//aubo-boxing : converting primitive to objects. they will become Object class obj
	al.add(10.10);
	al.add("Ravi");
	al.add(20);
	
	Object obj = al.get(2);
	Integer i = (Integer)obj;
	System.out.println(i);*/
		ArrayList al1= new ArrayList();					//with generics 
		ArrayList<Integer> al = new ArrayList<Integer>();	//with generics 
		al.add(100);				//aubo-boxing : converting primitive to objects. 
		al.add(200);
		al.add(300);
		
		int i  = al.get(0);		//aubo-unboxing : converting object to primitive 
		
		System.out.println(i);
	}

}
