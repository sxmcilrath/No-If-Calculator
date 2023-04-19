package calc;

public interface PMState {

	public String operate(String current);
	
	public PMState next();
}
