package tr.com.ckama;

interface Friend {
	String getName(); // h1
}

class Cat implements Friend {
	public String getName() { // h2
		return "Kitty";
	}
}

public class Q54 implements Friend { // Dog class
	public String getName() throws RuntimeException { // h3
		return "Doggy";
	}

	public static void main(String[] adoption) {
		Friend friend = new Q54(); // h4
		System.out.print(((Cat) friend).getName()); // h5
		System.out.print(((Q54) null).getName()); // h6
	}
}