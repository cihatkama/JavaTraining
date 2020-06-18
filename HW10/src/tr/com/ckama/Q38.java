package tr.com.ckama;

import java.util.function.Predicate;

public class Q38 { // Shoot
	interface Target {
		boolean needToAim(double angle);
	}

	static void prepare(double angle, Target t) {
		boolean ready = t.needToAim(angle); // k1
		System.out.println(ready);
	}

	public static void main(String[] args) {
		double d = 4.4;
//		prepare(45, d -> (d > 5 || d < -5)); // k2
	}
}