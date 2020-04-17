package tr.com.ckama;

public class Q44 { // think as Keyboard

	// numLock variable should be static for using inside main() method
	private static boolean numLock = true;
	static boolean capLock = false;

	public static void main(String... shortcuts) {
		System.out.print(numLock + " " + capLock);
	}
}
