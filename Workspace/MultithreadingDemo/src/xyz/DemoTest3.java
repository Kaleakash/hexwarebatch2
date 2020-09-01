package xyz;
class A implements Runnable{
	@Override
	public void run() {									// running 
				for(int i=0;i<=10;i++) {
					System.out.println("i  = "+i);
				}
	}																//i=0, thread get destroy 
}
class B implements Runnable{
	@Override
	public void run() {
		for(int j=0;j<=10;j++) {
			System.out.println("j  = "+j);
		}	
	}
}
public class DemoTest3 {
	public static void main(String[] args) throws Exception {
		A obj1 = new A();			// A class object created 
		B obj2 = new B();			
		Thread t1 = new Thread(obj1);		// Thread class reference.
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}
}
