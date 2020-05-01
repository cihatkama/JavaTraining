package tr.com.ckama;

public class Q40 { // think as TurtleVsHare class

	public static void main(String[] args) {
		int turtle = 10 * (2 + (3 + 2) / 5);
		int hare = turtle < 5 ? 10 : 25;
		System.out.print(turtle < hare ? "Hare wins!" : "Turtle wins!");
	}

}
