package tr.com.ckama;

public class Q05 {
	public static void main(String... teams) {
		int score = 1;
		try {
			System.out.print(score++);
		} catch (Throwable t) {
			System.out.print(score++);
		} finally {
			System.out.print(score++);
		}
		System.out.print(score++);
	}
}