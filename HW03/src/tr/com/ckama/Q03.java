package tr.com.ckama;

public class Q03 { // think as NameCheck class

	public static void main(String[] args) {
		String john = "john";
		String jon = new String("john");

		System.out.println((john == jon) + " " + (john.equals(jon)));
	}

}
