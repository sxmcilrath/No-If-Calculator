package calc;

public class IncompleteEquals extends EqualState {

	@Override
	public void operate(CalcInternal intern) {

		//shouldn't do anything
	}
	
	public EqualState next() {
		return this;
	}

}
