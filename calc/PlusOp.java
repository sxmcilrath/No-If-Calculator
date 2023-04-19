package calc;

import java.text.DecimalFormat;

public class PlusOp extends OpState {
	

	public String perform(double current, double total) {
		return (calcFormat.format(current + total));
	}
}
