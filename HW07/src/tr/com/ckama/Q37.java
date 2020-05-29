package tr.com.ckama;

interface SpeakDialogue {
	default int talk(String str) {
		return 7;
	}
}

interface SingMonologue {
	default int talk() {
		return 5;
	}
}

public class Q37 implements SpeakDialogue, SingMonologue { // Performance class
	public int talk(String... x) {
		return x.length;
	}

	public static void main(String[] notes) {
		System.out.print(new Q37().talk(notes));
	}
}