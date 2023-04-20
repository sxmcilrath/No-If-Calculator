package calc;
/**
 * 
 * @author Sam M
 *
 */
public class FirstPress implements PressState {

	@Override
	public void setCurrent(CalcInternal intern, String input) {
		intern.setCurrent(input);
		//intern.setTotal("0");
	}

	@Override
	public PressState next() {
		return new OtherPress();
	}

}
