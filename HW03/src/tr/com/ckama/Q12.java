package tr.com.ckama;

public class Q12 { // think as Pieces

	public static void main(String[] info) {
		int flair = 15;

		if (flair >= 15 && flair < 37) {
			System.out.print("Not enough ");
		}
		if (flair == 37) {
			System.out.print("Just right ");
		} else {
			System.out.println("too many ");
		}
	}

}
