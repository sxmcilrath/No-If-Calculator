package calc;

public class NoNumPM implements PMState {

	@Override
	public String operate(String current) {
		return "-";
	}
	
	public PMState next() {
		return new NoNumNegPM();
	}

}
