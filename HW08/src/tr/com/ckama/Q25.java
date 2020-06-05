package tr.com.ckama;

public class Q25 {
	private Boolean[] list = new Boolean[5];// value omitted

	public int printTodaysCount() {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if (list[i])
				++count;
		}
		return count;
	}

	public static void main(String[] roster) {
		new Q25().printTodaysCount();
	}
}