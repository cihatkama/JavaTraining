package tr.com.ckama;

public class Q50 { // class Baby

	public static String play(int toy, int age) {
		final String game;

		if (toy < 2)
			game = age > 1 ? "1" : "10"; // p1
		else
			game = age > 3 ? "Ball" : "Swim"; // p2
		return game;
	}

	public static void main(String[] vars) {
		System.out.println(play(5, 2));
	}

}
