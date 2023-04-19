package calc;

import java.text.DecimalFormat;

/**
 * Represents the internals of the calculator
 * stores nums, operations, and booleans depending on the case
 * @author Samuel McIlrath
 */

//thing
public class CalcInternal {
	String current = "";
	String total = "0";
	OpState op = new NoOp();
	DecState dec = new noDec();
	PMState pm = new NoNumPM();
	
	DecimalFormat calcFormat = new DecimalFormat("#.#############");
	
	public String takeNum(int num) {
		
		current = current + num;
		pm = new HasNumPM();
		
		return current;
	}
	
	public String takeOp(OpState operation) {
		op.operate(this);
		op = operation;
		pm = new NoNumPM();
		System.out.println(current + "current ");
		System.out.println(total + "total");
		return total;
	}
	
	public String dec() {
		current = dec.operate(current);
		dec = new hasDec();
		return current;
	}
	
	public String PM() {
		
		current = pm.operate(current);
		pm = pm.next();
		return current;
	}
	
	public void clear() {
		current = "";
		total = "0";
		op = new NoOp();
		dec = new noDec();
		pm = new NoNumPM();
	}
	
	
	

	
	
	public String getCurrent() {
		return current;
	}
	
	public String getTotal() {
		return total;
	}
	
	public void setCurrent(String current) {
		this.current  = current;
	}
	
	public void setTotal(String total) {
		this.total = total;
	}
		
	
}


