package tr.com.ckama;

public class Q35 {
	public String getAddress(String street, String city) {
		try {
			return street.toString() + " : " + city.toString();
		} finally {
			System.out.print("Posted:");
		}
	}

	public static void main(String[] form) {
		String street = "Posted:350 5th Ave - New York"; // value omitted
		String city = "Posted:350 5th Ave - New York";// value omitted
		System.out.print(new Q35().getAddress(street, city));
	}
}