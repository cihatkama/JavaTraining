package tr.com.ckama;

public class Q42 { // TestGame

	public String runTest(boolean spinner, boolean roller) {
		if (roller = spinner)
			return "up";
		else if (spinner = roller)
			return "what can I do sometimes?";
		else
			return roller ? "down" : "middle";
	}

	public static void main(String[] args) {
		final Q42 tester = new Q42();
		System.out.println(tester.runTest(false, true));
	}
}
