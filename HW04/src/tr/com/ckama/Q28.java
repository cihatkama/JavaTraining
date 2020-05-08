package tr.com.ckama;

public class Q28 { // class Sudoku

	static int[][] game = new int[6][6];

	public static void main(String[] args) {

		printArray(game);

		game[3][3] = 6;
		Object[] obj = game;
		obj[3] = "X";
		System.out.println(game[3][3]);
	}

	private static void printArray(int[][] game) {
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game.length; j++) {
				System.out.print(game[i][j] + " - ");
			}
			System.out.println();
		}
	}
}
