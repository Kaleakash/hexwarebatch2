package com;

import java.util.HashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		//HashMap hm = new HashMap();
		TreeMap hm = new TreeMap();
		hm.put(2, "Ravi");
		hm.put(1, "Ramesh");
		hm.put(3, "Rajesh");
		hm.put(5, "Ajay");
		
		System.out.println(hm);
		hm.put(1, "Dinesh");
		hm.put(6,"Ravi");
		System.out.println(hm);
	}

}
