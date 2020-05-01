package tr.com.ckama;

public class Q01 {

	public static void main(String[] args) {
		String user = "ckama";
		int userId = 145;
//		double rate = 12.7;
		char symbol = 'c';

		switch (user) {
		case "ckama":
			System.out.println("valid switch statement");
			break;
		default:
			break;
		}

		switch (userId) {
		case 145:
			System.out.println("valid switch statement");
			break;
		default:
			break;
		}

		/*
		 * switch (rate) { case 12.7: System.out.println("valid switch statement");
		 * break; default: break; }
		 */

		switch (symbol) {
		case 'c':
			System.out.println("valid switch statement");
			break;
		default:
			break;
		}

	}

}
