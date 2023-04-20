package calc;

public class NoOp extends OpState {

	public String perform(double current, double total) {
		return(calcFormat.format((current)));
	}
	
	public void operate(CalcInternal intern) {
		intern.setTotal(intern.getCurrent());
		intern.setCurrent("0");
	}
	
	public int equalsIndex() {
		return 0;
	}

}
