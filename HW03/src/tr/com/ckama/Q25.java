package tr.com.ckama;

public class Q25 { // think as Transportation class

	public static String travel(int distance) {
		return distance < 1000 ? "train" : new String("10");
	}

	public static void main(String[] args) {
		System.out.println(travel(500));
	}

}
