package calc;

public class MinOp extends OpState {

	@Override
	public String perform(double current, double total) {
		return calcFormat.format(total - current);
	}

}
