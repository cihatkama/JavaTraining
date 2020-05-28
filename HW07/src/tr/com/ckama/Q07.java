package tr.com.ckama;

class Automobile {
	private final String drive() {
		return "Driving vehicle";
	}
}

class Car extends Automobile {
	public String drive() {
		return "Driving car";
	}
}

public class Q07 extends Car {
	public final String drive() {
		return "Driving electric car";
	}

	public static void main(String[] wheels) {
		final Car car = new Q07();

		// ClassCastException
		// final Q07 electricCar = (Q07) new Car();
		// System.out.println(electricCar.drive());

		System.out.print(car.drive());
	}
}