package calc;

import java.text.DecimalFormat;

/**
 * Operation state for addition
 * @author Sam M
 *
 */
public class PlusOp extends OpState {
	

	/**
	 * just adds the two numbers together
	 */
	public String perform(double current, double total) {
		return (calcFormat.format(current + total));
	}
	
	/**
	 * returns the index for CompleteEquals state
	 * for use in the internals class
	 */
	public int equalsIndex() {
		return 1;
	}
}
