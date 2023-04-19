package calc;

public class NoOp implements OpState {

	@Override
	public void operate(CalcInternal intern, DecState dec) {
		intern.setTotal(intern.getCurrent());
		intern.setCurrent("");
	}

}
