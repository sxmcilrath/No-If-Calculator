package calc;

public class noDec implements DecState{

	@Override
	public String operate(String current) {
		
		return current + ".";
	}
	
	
}
