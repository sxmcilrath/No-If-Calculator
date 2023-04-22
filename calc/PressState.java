package calc;

/**
 * interface for which type of press the user is in.
 * This refers to pressing numbers and updating interns 
 * current variable
 * @author Sam M
 *
 */
public interface PressState {

	/**
	 * updates interns current based on press state
	 * @param intern	the calcs internals
	 * @param input		the most recent user number input
	 */
	public  void setCurrent(CalcInternal intern, String input );
	
	/**
	 * moves to the next state
	 * @return		returns the next PressState
	 */
	public PressState next();
}
