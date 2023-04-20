package calc;

import java.text.DecimalFormat;

public abstract class OpState {

	String current;
	String next;
	DecimalFormat calcFormat = new DecimalFormat("#.#############");

	
	abstract public String perform(double current, double total);
	
	abstract public int equalsIndex();
	
	
	public void operate(CalcInternal intern) {
		double current = Double.parseDouble(intern.getCurrent());
		double total = Double.parseDouble(intern.getTotal());
		intern.setTotal(perform(current, total));
		intern.setCurrent("0");
	}
}
