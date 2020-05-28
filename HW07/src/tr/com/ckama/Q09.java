package tr.com.ckama;

class Television {

	void printError() {

	}

	protected void watch() {
	}

	Object getObject() {
		return this;
	}
}

public class Q09 extends Television { // think as LCD class

	public void watch() {
	}

	protected Object getObject() {
		return this;
	}

	final void printError() {

	}
}