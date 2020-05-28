package tr.com.ckama;

public class Q03 {
	public void playMusic1() {
		System.out.print("Play!");
	}

	private int playMusic() {
		System.out.print("Music!");
		return 0;
	}

	public static void main(String[] tracks) {
		new Q03().playMusic1();
		new Q03().playMusic();
	}
}
