package tr.com.ckama;

public class Q23 {

	public static void main(String[] args) {
		letters: for (char ch = 'a'; ch <= 'z'; ch++) {
			numbers: for (int i = 0; i < 10; i++) {
				System.out.println(ch);
				// break;
				// break numbers;
				break letters;
			}
		}
	}
}
