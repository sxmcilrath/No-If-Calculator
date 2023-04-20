package calc;

public class CompleteEquals extends EqualState {

	@Override
	public void operate(CalcInternal intern) {
		prev = intern.getCurrent();
		prevOp = intern.getOp();
		intern.takeOp(new NoOp());
		intern.setCurrent(intern.getTotal());
		
	}
	
	public EqualState next() {
		return new ConsecutiveEquals(prev, prevOp);
	}

}
