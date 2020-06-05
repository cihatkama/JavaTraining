package tr.com.ckama;

class CapsizedException extends Exception {
	private static final long serialVersionUID = 1L;
}

class Transport {
	public int travel() throws CapsizedException {
		return 2;
	};
}

public class Q17 {
	public int travel() throws Exception {
		return 4;
	}; // j1

	public static void main(String... distance) throws Exception {
		try {
			System.out.print(new Q17().travel());
		} catch (Exception e) {
			System.out.print(8);
		}
	}
}