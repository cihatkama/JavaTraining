package tr.com.ckama;

interface MusicCreator {
	public Number play();
}

abstract class StringInstrument {
	public Long play() {
		return 3L;
	}
}

public class Q48 extends StringInstrument implements MusicCreator {

	// Long requires to casting
	// Integer is not a subclass of Long. It is invalid.
	// Number is superclass of these. It is invalid.

	public Long play() {

		return (long) 12;

	}
}