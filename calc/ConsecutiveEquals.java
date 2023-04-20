package calc;

public class ConsecutiveEquals extends EqualState {

	public ConsecutiveEquals(String prev, OpState prevOp) {
		this.prev = prev;
		this.prevOp = prevOp;
	}
	@Override
	public void operate(CalcInternal intern) {
		// TODO Auto-generated method stub

	}

	@Override
	public EqualState next() {
		// TODO Auto-generated method stub
		return this;
	}

}
