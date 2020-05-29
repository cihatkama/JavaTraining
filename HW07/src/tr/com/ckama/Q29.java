package tr.com.ckama;

abstract class Ball {
	protected final int size;

	public Ball(int size) {
		this.size = size;
	}
}

interface Equipment {
}

public class Q29 extends Ball implements Equipment { // class SoccerBall
	public Q29() {
		super(5);
	}

	public Ball get() {
		return this;
	}

	public static void main(String[] passes) {
		Equipment equipment = (Equipment) new Q29().get();
		System.out.print(((Q29) equipment).size);
	}
}