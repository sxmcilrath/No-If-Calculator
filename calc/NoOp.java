package calc;

public class NoOp extends OpState {

	public String perform(double current, double total) {
		return(calcFormat.format((current)));
	}

}
