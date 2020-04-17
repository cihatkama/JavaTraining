package tr.com.ckama;

import sports.Bicycle;

public class Q46 {

	public static void main(String[] args) {

		new Bicycle().printColor("blue");

		Bicycle bicycle = new Bicycle();
		System.out.println("Bicycle color : " + bicycle.getColor());

		bicycle.setColor("black");
		System.out.println("Bicycle modified color : " + bicycle.getColor());

	}

}
