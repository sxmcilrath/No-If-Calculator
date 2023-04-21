package calc;

/**
 * Operation state to represent subtraction
 * @author Sam MS
 *
 */
public class MinOp extends OpState {

	@Override
	/**
	 * subtracts current from total
	 */
	public String perform(double current, double total) {
		return calcFormat.format(total - current);
	}

	/**
	 * returns index for completeEquals state in internal
	 */
	public int equalsIndex() {
		return 1;
	}
}
