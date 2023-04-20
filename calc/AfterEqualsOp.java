package calc;

public class AfterEqualsOp extends OpState {

	@Override
	public String perform(double current, double total) {
		return calcFormat.format(total);
	}

	@Override
	public int equalsIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

}
