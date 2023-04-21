package calc;

/**
 * PMState where the number is a decimal
 * @author Sam M
 *
 */
public class HasDecPM implements PMState {

	@Override
	/**
	 * seperates current into before and after the decimal
	 * then it flips the sign of beforeDec and then 
	 * recombines the decimal
	 */
	public String operate(String current) {
		String beforeDec = current.substring(0, current.indexOf('.'));
		System.out.println(beforeDec);
		
		String afterDec = current.substring(current.indexOf('.'));
		System.out.println(afterDec);
		
		System.out.println((0 - Integer.parseInt(beforeDec)) + afterDec);
		return (0 - Integer.parseInt(beforeDec)) + afterDec;
	}

	@Override
	/**
	 * returns itself
	 */
	public PMState next() {
		// TODO Auto-generated method stub
		return this;
	}

}
