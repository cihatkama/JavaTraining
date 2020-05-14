package tr.com.ckama;

public class Q27 {
	public static void main(String[] args) {
		boolean balloonInflated = false;
		do {
			if (!balloonInflated) {
				balloonInflated = true;
				System.out.print("inflate-");
			}
		} while (!balloonInflated);
		System.out.println("done");
	}
}
