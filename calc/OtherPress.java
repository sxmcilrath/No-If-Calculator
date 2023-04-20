package calc;

public class OtherPress implements PressState {

	@Override
	public void setCurrent(CalcInternal intern, String input) {
		intern.setCurrent(intern.getCurrent() + input);
	}

	@Override
	public PressState next() {
		return this;
	}

}
