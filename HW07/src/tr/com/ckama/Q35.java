package tr.com.ckama;

interface CanFly {
	public void fly();
}

class Bird {
	public int fly(int speed) {
		return 0;
	}
}

public class Q35 extends Bird implements CanFly {
	public void fly() {
	}
}