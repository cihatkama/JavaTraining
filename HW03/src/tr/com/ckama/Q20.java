package tr.com.ckama;

public class Q20 {

	public static void main(String[] args) {
		int leaders = 10 * (2 + (1 + 2 / 5));
		System.out.println(leaders);
		int followers = leaders * 2;
		System.out.println(2 / 5);
		System.out.println(leaders + followers < 10 ? "too few" : "too many");
	}

}
