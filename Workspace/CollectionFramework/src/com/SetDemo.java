package com;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//LinkedHashSet lh = new LinkedHashSet();
		TreeSet lh = new TreeSet();
		lh.add(100);
		lh.add(400);
		lh.add(300);
		lh.add(100);
	//	lh.add("Ravi");
		System.out.println(lh);
		lh.remove(100);
		System.out.println(lh);
		System.out.println("Search "+lh.contains(300));
		System.out.println("Search "+lh.contains(100));
	}

}
