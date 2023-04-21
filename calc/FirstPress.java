package calc;
/**
 * press state that represents the first user press
 * @author Sam M
 *
 */
public class FirstPress implements PressState {

	@Override
	/**
	 * straight out sets the current number to the user's input
	 */
	public void setCurrent(CalcInternal intern, String input) {
		intern.setCurrent(input);
	}

	@Override
	/**
	 * returns the next state OtherPress
	 */
	public PressState next() {
		return new OtherPress();
	}

}
