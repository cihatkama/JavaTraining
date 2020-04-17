package tr.com.ckama;

public class Q10 {

	static String weight = "A lot.";
	/* default */ double ageMonths = 5, ageDays = 2;
	private static boolean success = true;

	public void main(String[] args) {
		final String retries = "1";

		Q10 instance = new Q10();
		System.out.println("class variable ageDays : " + instance.ageDays);
		System.out.println("class variable ageMonths : " + instance.ageMonths);

		System.out.println("static variable weight : " + instance.weight);
		System.out.println("static variable success : " + instance.success);

		System.out.println("local variable retries : " + retries);

	}

}
