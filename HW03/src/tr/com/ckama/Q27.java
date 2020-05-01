package tr.com.ckama;

public class Q27 {

	public static void main(String[] args) {
		String nonNullString = "Test variable";
		String nullString = null;
		String notInitializedString;

		boolean resNonNullStr = nonNullString.equals(null);
//		boolean resNullStr = nullString.equals(null);
//		boolean resNotInitializedStr = notInitializedString.equals(null);

		System.out.println(resNonNullStr);
//		System.out.println(resNullStr);
//		System.out.println(resNotInitializedStr);

	}

}
