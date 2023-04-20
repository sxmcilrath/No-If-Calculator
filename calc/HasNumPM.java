package calc;

import java.text.DecimalFormat;

public class HasNumPM implements PMState {
	DecimalFormat calcFormat = new DecimalFormat("#.#############");
	
	@Override
	public String operate(String current) {
		
		double temp = Double.parseDouble(current);
		
		return calcFormat.format(0 - temp);
	}
	
	public PMState next() {
		return this;
	}

}
