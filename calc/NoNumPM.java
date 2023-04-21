package calc;

/**
 * PM State to represent the case where 
 * current is just an empty string
 * @author Sam M
 *
 */
public class NoNumPM implements PMState {

	@Override
	/* 
	 *makes current hold "-"
	 */
	public String operate(String current) {
		return "-";
	}
	
	/**
	 * returns the the NoNumNeg state for PM
	 */
	public PMState next() {
		return new NoNumNegPM();
	}

}
