package calc;

public class AfterEqualsOp extends OpState {

	@Override
	public String perform(double current, double total) {
		return calcFormat.format(total);
	}

	public void operate(CalcInternal intern) {
		double total = Double.parseDouble(intern.getTotal());
		intern.setTotal(perform(0, total));
		intern.setCurrent("0");
	}
	@Override
	public int equalsIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

}
