package calc;

/**
 * interface for the PM states
 * @author Sam M
 *
 */
public interface PMState {

	/**
	 * alters the current number based on state
	 * @param current		the current number
	 * @return				the modified current number
	 */
	public String operate(String current);
	
	/**
	 * gets the next state
	 * 
	 * @return		the next PM state
	 */
	public PMState next();
}
