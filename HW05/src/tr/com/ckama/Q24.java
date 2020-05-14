package tr.com.ckama;

public class Q24 {

	public static void main(String[] args) {
		letters: for (char ch = 'a'; ch <= 'z'; ch++) {
			numbers: for (int i = 0; i < 10; i++) {
				System.out.println(ch);
				continue letters;
			}
		}
	}
}
