package tr.com.ckama;

class OutOfBoundsException extends BadCatchException {
}

class BadCatchException extends Exception {
}

interface Outfielder {
	public void catchBall() throws OutOfBoundsException;
}

public class Q42 implements Outfielder {

	@Override
	public void catchBall() throws OutOfBoundsException {
		// TODO Auto-generated method stub

	}

}
