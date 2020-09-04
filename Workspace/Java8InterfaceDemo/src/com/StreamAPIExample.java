package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.Stream;

class DisplayInfo implements Consumer<Integer>{
	@Override
	public void accept(Integer t) {
	System.out.println("Value is "+t);	
	}
}
public class StreamAPIExample {

	public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	al.add(10);al.add(12);al.add(13);al.add(14);al.add(15);al.add(16);al.add(17);al.add(18);
	al.add(19);al.add(20);al.add(21);al.add(22);al.add(23);al.add(24);al.add(25);al.add(26);al.add(27);
	al.add(30);al.add(31);al.add(32);al.add(33);al.add(34);al.add(36);
	System.out.println("Using Iterator");
	Iterator<Integer> ii =al.iterator();
	int sum =0;
	int sumOfEven = 0;
	while(ii.hasNext()) {
		//System.out.println(ii.next());
		int num = ii.next();
		sum = sum +num;
		if(num%2==0) {
			sumOfEven = sumOfEven +num;
		}
	}
	System.out.println("Sum of all number is "+sum);
	System.out.println("Sum of even number is "+sumOfEven);
	System.out.println("Using Stream API");
	//Stream<Integer> ss = al.stream();			// converting ArrayList to Stream 
	//ss.forEach((val)->System.out.println("value is "+val));
	//Consumer<Integer> cc = new DisplayInfo();
	//ss.forEach(cc);
	//al.stream().forEach(val->System.out.println(val));  //display all records 
	//stream will get destroy. 
//	al.stream().filter((val)->val%2==0).forEach(data->System.out.println(data));		// only even 
//	al.stream().filter((val)->val%2!=0).forEach(data->System.out.println(data));		//only odd
	int sumOfNat = al.stream().mapToInt(m->m).sum();
	int sumOfEven1 = al.stream().filter(val->val%2==0).mapToInt(m->m).sum();
	System.out.println("Sum of natural numbers are "+sumOfNat);
	System.out.println("Sum of even numbers are "+sumOfEven1);
	}

}
