package calc;

/**
 * op state for division
 * @author Sam M
 *
 */
public class DivOp extends OpState {

	@Override
	/**
	 * divides the total by the current num
	 */
	public String perform(double current, double total) {
		//checks for div by 0
		if(current == 0) {
			return 0+"";
		}
		return calcFormat.format(total / current);
		
	}
	
	/**
	 * would return the completeEquals state in internals 
	 */
	public int equalsIndex() {
		return 1;
	}

}
