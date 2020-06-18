package tr.com.ckama;

class BubbleException extends Exception {
}

class Fish {
	Fish getFish() throws BubbleException {
		throw new RuntimeException("fish!");
	}
}

public final class Q17 extends Fish { // Clownfish
	public final Q17 getFish() {
		throw new RuntimeException("clown!");
	}

	public static void main(String[] bubbles) throws BubbleException {
		final Fish f = new Q17();
		f.getFish();
		System.out.println("swim!");
	}
}