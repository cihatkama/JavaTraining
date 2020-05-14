package tr.com.ckama;

public class Q14 {
	public static void main(String[] args) {
		String letters = "";
//		System.out.println("size of letters: " + letters.length());
		while (letters.length() != 2) {
			letters += "a";
//			System.out.println("size of letters: " + letters.length());
		}
		System.out.println(letters);
	}
}
