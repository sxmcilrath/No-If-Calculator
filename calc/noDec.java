package calc;

/**
 * dec state for when current has no decimal
 * @author mac5p
 *
 */
public class noDec implements DecState{

	@Override
	/**
	 * add a decimal to current string
	 */
	public String operate(String current) {
		
		return current + ".";
	}
	
	
}
