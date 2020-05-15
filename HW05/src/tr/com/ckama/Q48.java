package tr.com.ckama;

public class Q48 {
	public static void main(String[] args) {
		int result = 8;
		for_label: while (result > 7) {
			result++;
			do {
				result--;
			} while (result > 5);
			break for_label;
		}
		System.out.println(result);
	}
}
