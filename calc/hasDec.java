package calc;

/**
 * Dec state that deals with current when it has
 * a decimal
 * @author Sam M
 *
 */
public class hasDec implements DecState {

	@Override
	/**
	 * doesn't alter current, leaves it alone
	 */
	public String operate(String current) {
		
		return current;
	}
	

}
