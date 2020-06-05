package tr.com.ckama;

public class Q28 {
	public static String getFullName(String firstName, String lastName) {
		try {
			return firstName.toString() + " " + lastName.toString();
		} catch (NullPointerException npe) {
			System.out.print("Problem?");
		} finally {
			System.out.print("Finished!");
		}
		return null;
	}

	public static void main(String[] things) {
		System.out.print(getFullName("Joyce", "Hopper"));
	}
}