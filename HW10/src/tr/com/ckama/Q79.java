package tr.com.ckama;

abstract class Bear {
	protected int sing;

	protected abstract int grunt();

	int sing() {
		return sing;
	}
}

public class Q79 extends Bear { // PolarBear class
	protected int grunt() {
//		return sing() += 10;
//		return super.grunt() + 1;
		return 10;
	}
}