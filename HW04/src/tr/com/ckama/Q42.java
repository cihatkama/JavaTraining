package tr.com.ckama;

public class Q42 {
	static int[][] game;

	public static void main(String[] args) {
		game[3][3] = 6;
		Object[] obj = game;
		game[3][3] = 4;
		System.out.println(game[3][3]);
	}
}
