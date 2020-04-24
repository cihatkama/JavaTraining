package store;

public class Toy {
	public void play() {
		System.out.print("play-");
	}

	public void finalizer() {
		System.out.print("clean-");
	}

	public static void main(String[] args) {
		Toy car = new Toy();
		car.play();
		System.gc();
		Toy doll = new Toy();
		doll.play();
	}
}
