package calc;

public interface PressState {

	public  void setCurrent(CalcInternal intern, String input );
	
	public PressState next();
}
