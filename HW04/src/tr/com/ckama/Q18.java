package tr.com.ckama;

public class Q18 {
	public static void main(String[] args) {
		char[][] ticTacToe = new char[3][3]; // r1
		ticTacToe[0][2] = 'X'; // r2
		ticTacToe[1][1] = 'X';
		ticTacToe[2][0] = 'X';
		System.out.println(ticTacToe.length + " in a row!"); // r3
	}
}
