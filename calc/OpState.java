package calc;

import java.text.DecimalFormat;

/**
 * Abstract class for operation states
 * @author mac5p
 *
 */
public abstract class OpState {

	
	
	DecimalFormat calcFormat = new DecimalFormat("#.#############");

	/**
	 * the abstract method that has each state 
	 * perform its operation
	 * @param current	the current number
	 * @param total		the running total
	 * @return			the new total
	 */
	abstract public String perform(double current, double total);
	
	/**
	 * this is used in calcInternal to access an array of equals states 
	 * and set the appropriate state based on the operation
	 * @return	either 0 or 1
	 */
	abstract public int equalsIndex();
	
	/**
	 * almost all states repeat this code when performing 
	 * their operation. It just gathers the current and total 
	 * as doubles and performs the corresponding operation.
	 * It then updates the calc internal variables
	 * @param intern	calc internal
	 */
	public void operate(CalcInternal intern) {
		//turns intern strings to doubles
		double current = Double.parseDouble(intern.getCurrent());
		double total = Double.parseDouble(intern.getTotal());
		
		//updates  intern variables
		intern.setTotal(perform(current, total));
		intern.setCurrent("0");
	}
}
