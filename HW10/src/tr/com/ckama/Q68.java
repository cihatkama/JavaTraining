package tr.com.ckama;

public class Q68 { // Seasons class
	public static void seasons(String... names) {
		int l = names[1].length(); // s1
		System.out.println(names[l]); // s2
	}

	public static void main(String[] args) {
		seasons("Summer", "Fall", "Winter", "Spring");
	}
}