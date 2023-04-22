package calc;

/**
 *  Press state that represents any press 
 *  besides the first press
 * @author Sam M
 *
 */
public class OtherPress implements PressState {

	@Override
	/**
	 * adds the input onto the end of the current string
	 * and updates intern current
	 */
	public void setCurrent(CalcInternal intern, String input) {
		intern.setCurrent(intern.getCurrent() + input);
	}

	@Override
	/**
	 * returns itself as the next state
	 */
	public PressState next() {
		return this;
	}

}
