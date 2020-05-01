package tr.com.ckama;

public class Q28 { // class Road

	public static void main(String... args) {
		int intersections = 100;
		int streets = 200;

		if (intersections < 150) {
			System.out.print("1");
		} else if (streets > 1000 && intersections > 1000) {
			System.out.print("2");
		}
		if (streets < 500)
			System.out.print("1");
		else
			System.out.print("2");
	}

}
