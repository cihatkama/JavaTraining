package tr.com.ckama;

public class Q14 { // Sudoku
	static int[][] game;

	public static void main(String args[]) {
		game[3][3] = 6;
		Object[] obj = game;
		obj[3] = 'X';
		System.out.println(game[3][3]);
	}
}