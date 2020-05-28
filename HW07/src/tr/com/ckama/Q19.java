package tr.com.ckama;

interface Horn {
	public Short play();
}

abstract class Woodwind {
	public Short play() {
		return 3;
	}
}

public final class Q19 extends Woodwind implements Horn { // class Saxophone
	public Short play() {

		return null;
	}

	public static void main(String[] args) {
		Tree appleTree = new AppleTree();
		System.out.println(appleTree.getName());
	}
}

abstract class Tree {
	public String getName() {
		return "Tree";
	}
}

class AppleTree extends Tree {

	@Override
	public String getName() {
		return super.getName(); // It returns "Tree"
//		return "Apple Tree";	// It returns "Apple Tree"
	}
}