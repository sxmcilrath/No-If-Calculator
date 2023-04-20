package calc;

/**
 * Abstract class for equals states
 * @author Sam M
 *
 */
public interface EqualState {

	/**
	 * depending on the state it's in
	 * it will alter the expression
	 * @param intern
	 */
	public void operate(CalcInternal intern);
	
	
}
