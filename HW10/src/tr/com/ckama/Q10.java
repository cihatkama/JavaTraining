package tr.com.ckama;

public class Q10 { // Giggles class

	public static void main(String[] args) {
		String lol = "lol";
		System.out.println(lol.toUpperCase() == lol);
		System.out.println(lol.toUpperCase() == lol.toUpperCase());
		System.out.println(lol.toUpperCase().equals(lol));
		System.out.println(lol.toUpperCase().equals(lol.toUpperCase()));
		System.out.println(lol.toUpperCase().equalsIgnoreCase(lol));
		System.out.println(lol.toUpperCase().equalsIgnoreCase(lol.toUpperCase()));
	}
}