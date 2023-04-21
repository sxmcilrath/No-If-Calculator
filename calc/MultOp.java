package calc;

/**
 * Operation state for multiplication
 * @author Sam M
 *
 */
public class MultOp extends OpState {

	/**
	 * multiplies current by total
	 */
	public String perform(double current, double total) {
		return calcFormat.format(current * total);
	}
	
	/**
	 * returns index for completeEquals state 
	 * for use in internal
	 */
	public int equalsIndex() {
		return 1;
	}

}
