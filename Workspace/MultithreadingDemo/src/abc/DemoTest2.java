package abc;
class A extends Thread{
	@Override
	public void run() {									// running 
				for(int i=0;i<=10;i++) {
					System.out.println("i  = "+i);
				}
	}																//i=0, thread get destroy 
}
class B extends Thread{
	@Override
	public void run() {
		for(int j=0;j<=10;j++) {
			System.out.println("j  = "+j);
		}	
	}
}
public class DemoTest2 {
	public static void main(String[] args) throws Exception {
		A obj1 = new A();			// obj1 is thread class reference created..
		B obj2 = new B();			
		obj1.start();                 //ready to run ie Runnable state start() method internally call run() method 
		if(obj1.isAlive()) {
			obj2.start();
		}
		obj2.join();
	}

}
