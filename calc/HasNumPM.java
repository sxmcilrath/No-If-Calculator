package calc;

import java.text.DecimalFormat;

/**
 * PM state for when current is not blank 
 * and is an integer 
 * @author Sam M
 *
 */
public class HasNumPM implements PMState {
	DecimalFormat calcFormat = new DecimalFormat("#.#############");
	
	@Override
	/**
	 * flips the sign of current by doing 
	 * 0 - current
	 */
	public String operate(String current) {
		
		double temp = Double.parseDouble(current);
		
		return calcFormat.format(0 - temp);
	}
	
	/**
	 * returns itself
	 */
	public PMState next() {
		return this;
	}

}
