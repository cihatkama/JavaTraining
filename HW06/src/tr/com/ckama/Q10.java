package tr.com.ckama;

public class Q10 {
	private int rope = 1; // default 0
	protected boolean outside; // default false

	public Q10() {
		// p1
		this(4);
//		new Q10(4);
//		this(5);
//		rope = 4;

//		outside = true;
	}

	public Q10(int rope) {
		this.rope = outside ? rope : rope + 1;
	}

	public static void main(String[] bounce) {
		System.out.println(new Q10().outside);
		System.out.print(new Q10().rope);
	}
}
