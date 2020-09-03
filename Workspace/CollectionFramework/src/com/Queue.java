package com;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
	PriorityQueue pq = new PriorityQueue();
	pq.add(3);
	pq.add(1);
	pq.add(5);
	pq.add(2);
	pq.add(6);
	pq.add(9);
	System.out.println(pq);
	System.out.println(pq.poll());
	System.out.println(pq);
	System.out.println(pq.poll());
	System.out.println(pq);
	}

}
