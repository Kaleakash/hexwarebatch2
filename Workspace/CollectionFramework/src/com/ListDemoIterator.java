package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemoIterator {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);			//auto-boxing : converting primitive to objects. They become super class objects. 
		al.add(200);
		al.add(300);
		al.add(400);
		System.out.println(al);
		//retrieve records one by one using For each loop 
		System.out.println("Using For each loop");
		for(Object obj:al) {
			System.out.println(obj);
		}
		System.out.println("Using iterator");
		    Iterator ii =  al.iterator();
		    while(ii.hasNext()) {
		    	System.out.println(ii.next());
		    }
		    System.out.println("Using ListIterator");
		    ListIterator li1  = al.listIterator();
		    System.out.println("Forward using - List Iterator");
		    while(li1.hasNext()) {
		    	System.out.println(li1.next());
		    }
		    System.out.println("backward using - List Iterator");
		    while(li1.hasPrevious()) {
		    	System.out.println(li1.previous());
		    }
	}

}
