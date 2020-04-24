package tr.com.ckama;

public class Q37 {
	public static void main(String[] args) {
		new InitOrder().print();
	}
}

class InitOrder {
	public String first = "instance";

	public InitOrder() {
		first = "constructor";
	}

	{
		first = "block";
	}

	public void print() {
		System.out.println(first);
	}
}
