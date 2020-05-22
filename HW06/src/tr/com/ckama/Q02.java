package tr.com.ckama;

public class Q02 {

	public static void main(String[] args) {
		new Car();
		System.out.println("Inside main() method");

	}

}

class Vehicle {

	public Vehicle() {
		System.out.println("Vehicle class's constructor");
	}

}

class Car extends Vehicle {

	public Car() {
		super();
		System.out.println("Car class's constructor");
	}

}