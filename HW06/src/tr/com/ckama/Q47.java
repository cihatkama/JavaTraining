package tr.com.ckama;

public class Q47 {
	public static Long getScore(int startTime) {
		return (long) (2 * startTime); // m1
	}

	public static void main(String[] refs) {
		final int startTime = 4;
		System.out.print(getScore(startTime)); // m2
	}
}
