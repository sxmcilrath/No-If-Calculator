package calc;

/**
 * PM state where there is no number but PM has 
 * already been pressed
 * @author mac5p
 *
 */
public class NoNumNegPM implements PMState {

	@Override
	/**
	 * removes the negative symbol by 
	 * returning empty string
	 */
	public String operate(String current) {
		return "";
	}

	@Override
	/**
	 * switches states to noNumPM
	 */
	public PMState next() {
		return new NoNumPM();
	}

}
