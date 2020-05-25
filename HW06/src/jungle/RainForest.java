package jungle;

public class RainForest {

	private long treeCount;

//	public RainForest() {
//		super();
//	}

	public RainForest(long treeCount) {
		this.treeCount = treeCount + 1;
	}

	public static void main(String[] args) {
		System.out.println(new RainForest(5).treeCount);
	}
}

class Forest {
	public long treeCount;

	public Forest(long treeCount) {
		this.treeCount = treeCount + 2;
	}
}