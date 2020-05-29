package tr.com.ckama;

class Canine {
}

class Dog extends Canine {
}

class Wolf extends Canine {
}

final class Husky extends Dog {
}

public class Q42 {
	Canine animal;

	public final void setAnimal(Dog animal) {
		this.animal = animal;
	}

	public static void main(String[] furryFriends) {
		new Q42().setAnimal(new Dog());
		new Q42().setAnimal(new Husky());
		new Q42().setAnimal((Dog) new Canine());
//		new Q42().setAnimal(new Wolf());
		new Q42().setAnimal(null);
	}
}