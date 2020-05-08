package tr.com.ckama;

public class Q26 {
	public static void main(String[] args) {
		char[][] ticTacToe = new char[3][3]; // r1
		ticTacToe[0][2] = 'X'; // r2
		ticTacToe[1][2] = 'X';
		ticTacToe[2][2] = 'X';
		System.out.println(ticTacToe.length + " in a row!"); // r3
	}
}
