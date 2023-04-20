package calc;

/**
 * represets equal state when a full expression is entered
 * @author Samuel McIlrath
 *
 */
public class CompleteEquals implements EqualState {

	@Override
	/**
	 * takes the internal 
	 * Then updates current and sets the new operation as NoOp
	 */
	public void operate(CalcInternal intern) {
		intern.takeOp(new NoOp());
		intern.setCurrent(intern.getTotal());
		
	}
}
	
