package tr.com.ckama;

public class Q49 {
	public static void main(String[] args) {
		boolean baloonInflated = false;
		do {
			if (!baloonInflated) {
				baloonInflated = true;
				System.out.print("inflate-");
			}
			break;
		} while (baloonInflated);
		System.out.println("done");
	}
}
