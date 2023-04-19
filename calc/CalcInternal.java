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
	
	public String takeNum(int num) {
		
		current = current + num;
		
		return current;
	}
	
	public String takeOp(OpState operation) {
		op.operate(this);
		op = operation;
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
		
		return "";
	}
	
	public void clear() {
		current = "";
		total = "0";
		op = new NoOp();
		dec = new noDec();
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


