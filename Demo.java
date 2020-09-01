class Demo {
	public static void main(String args[]) {
		int []abc=new int[10];
		int n=100;
		for(int i=0;i<abc.length;i++) {
			abc[i]=n++;
		}
		System.out.println("Display data");
		for(int a:abc) {
			System.out.println(a);
		}
	}

}