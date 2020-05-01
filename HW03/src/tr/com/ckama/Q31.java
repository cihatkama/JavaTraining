package tr.com.ckama;

public class Q31 { // AreYouBob

	public static void main(String[] args) {
		String bob = new String("bob");
		String notBob = bob;
		System.out.println((bob == notBob) + " " + bob.equals(notBob));
	}

}
