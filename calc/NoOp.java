package calc;

/**
 * operation state where no operation has been clicked yet
 * also used to reset things after equals has been pressed
 * @author Sam M
 *
 */
public class NoOp extends OpState {

	/**
	 * just returns current so that it can be set to total.
	 * Allows the user to start modifying the second number in the
	 * expression
	 */
	public String perform(double current, double total) {
		return(calcFormat.format((current)));
	}
	
	/**
	 * overrides abstract class operate()
	 * this is to avoid errors with Double.parseDouble
	 */
	public void operate(CalcInternal intern) {
		intern.setTotal(intern.getCurrent());
		intern.setCurrent("0");
	}
	
	/**
	 * returns the index for IncompleteEquals state 
	 * in internal
	 */
	public int equalsIndex() {
		return 0;
	}

}
