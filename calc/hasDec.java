package calc;

public class hasDec extends DecState<Double> {

	@Override
	public String operate(String current) {
		
		return current;
	}
	
	public Double alterNum(String temp) {
		return Double.parseDouble(temp);
	}

}
