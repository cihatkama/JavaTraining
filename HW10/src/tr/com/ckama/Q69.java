package tr.com.ckama;

interface MakesNoise {
}

abstract class Instrument implements MakesNoise {
	public Instrument(int beats) {
	}

	public void play() {
	}
}

public class Q69 extends Instrument { // Drum class
	public Q69(int beats) {
		super(beats);
		// TODO Auto-generated constructor stub
	}

	public void play(int count) {
	}

	public void concert() {
		super.play();
	}

	public static void main(String[] beats) {
		MakesNoise mn = new Q69(0);
		((Q69) mn).concert();
	}
}