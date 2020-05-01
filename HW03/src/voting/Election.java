package voting;

public class Election {

	public void calculateResult(Integer candidateA, Integer candidateB) {
		boolean process = candidateA == null || candidateA.intValue() < 10;
		boolean value = false;
		/* = candidateA && candidateB; */

		System.out.println(process || value);

	}

}
