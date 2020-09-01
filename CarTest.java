class Car {

	Car() {
		System.out.println("Car object created...");
	}
	
	void carInfo() {
		System.out.println("Car method");
	}	
}

class CarTest {
	public static void main(String args[]) {
	Car santro = new Car();
	santro.carInfo();
	santro.carInfo();
	
	Car innova = new Car();
	innova.carInfo();
	innova.carInfo();
	innova.carInfo();	
	}
}