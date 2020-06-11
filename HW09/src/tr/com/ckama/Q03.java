package tr.com.ckama;

public class Q03 {

	public static void main(String[] args) {

		StringBuilder firstStrBuilder = new StringBuilder().append("clown");
		StringBuilder secondStrBuilder = new StringBuilder("clown");
		StringBuilder thirdStrBuilder = new StringBuilder("cl").insert(2, "own");

		System.out.println(firstStrBuilder.toString());
		System.out.println(secondStrBuilder.toString());
		System.out.println(thirdStrBuilder.toString());

	}

}
