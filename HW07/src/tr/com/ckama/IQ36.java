package tr.com.ckama;

interface IQ36 {

	static int variable = 1;

	static int getVariable() {
		return variable;
	}

	default void setVariable(int paramVar) {
		this.setVariable(paramVar);
	}

	abstract String getMessage();

}

abstract class AC36 {
	static int variable = 1;

	static int getVariable() {
		return variable;
	}

//	default void setVariable(int paramVar) {
//		this.setVariable(paramVar);
//	}

	abstract String getMessage();
}
