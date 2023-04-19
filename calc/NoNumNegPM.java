package calc;

public class NoNumNegPM implements PMState {

	@Override
	public String operate(String current) {
		return "";
	}

	@Override
	public PMState next() {
		return new NoNumPM();
	}

}
