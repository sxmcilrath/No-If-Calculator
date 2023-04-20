package calc;

public abstract class EqualState {
	String prev;
	OpState prevOp;
	
	
	abstract public void operate(CalcInternal intern);
	
	abstract public EqualState next();
}
