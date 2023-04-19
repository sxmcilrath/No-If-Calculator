package calc;

public class DivOp extends OpState {

	@Override
	public String perform(double current, double total) {
		return calcFormat.format(total / current);
	}

}
