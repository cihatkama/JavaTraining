package tr.com.ckama;

public class Q11 {
	public static void main(String[] args) {
		boolean singer = true;

		// constructed infinite loop
		while (singer)
			System.out.println(!singer);
	}
}
