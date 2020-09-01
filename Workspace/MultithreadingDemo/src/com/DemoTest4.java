package com;
class Booking implements Runnable {
	int avl =1;
	@Override
	public synchronized void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if(avl==1) {
			System.out.println(name+" got the ticket");
			avl = avl-1;
		}else {
			System.out.println(name+" sorry no ticket");
		}
	}
}
public class DemoTest4 {
	public static void main(String[] args) {
	Booking bb = new Booking();
	Thread t1 = new Thread(bb);
	Thread t2 = new Thread(bb);
	Thread t3 = new Thread(bb);
	Thread t4 = new Thread(bb);
	t1.setName("Ravi"); t2.setName("Ramesh"); t3.setName("Ajay"); t4.setName("Vijay");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	}

}
