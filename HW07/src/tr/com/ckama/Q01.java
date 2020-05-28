
package tr.com.ckama;

class Cinema {
	protected String name;

//	public Cinema() {
//		// TODO Auto-generated constructor stub
//	}

	public Cinema(String name) {
		this.name = name;
	}

}

public class Q01 extends Cinema { // think as Movie class
	public Q01(String movie) {
		super("Lord of The Rings");
	}

	public static void main(String[] showing) {
		System.out.print(new Q01("Another Trilogy").name);
	}
}