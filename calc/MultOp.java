package calc;

public class MultOp extends OpState {

	public String perform(double current, double total) {
		return calcFormat.format(current * total);
	}

}
