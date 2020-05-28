package tr.com.ckama;

public class Q25 {

	public static void main(String[] args) {
		Device device = new Phone();
		Phone phone = (Phone) new Device();

		Machine machine = new Engine() {

		};

		// invalid declaration
		// Engine engine = new Machine() {
		// };
	}

}

class Device {

}

class Phone extends Device {

}

interface Machine {

}

class Engine implements Machine {
}