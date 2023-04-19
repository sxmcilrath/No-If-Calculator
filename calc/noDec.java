package calc;

public class noDec extends DecState<Integer> {

	@Override
	public String operate(String current) {
		
		return current + ".";
	}
	
	public Integer alterNum(String temp) {
		return (int)(Double.parseDouble(temp));
	}

}
