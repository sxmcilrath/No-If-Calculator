package calc;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents the internals of the calculator
 * stores nums, operations, and booleans depending on the case
 * @author Samuel McIlrath
 */

//thing
public class CalcInternal {
	String current = "0";
	String total = "0";
	String postDec;
	
	OpState op = new NoOp();
	DecState dec = new noDec();
	PMState pm = new NoNumPM();
	EqualState eq = new IncompleteEquals();
	PressState press = new FirstPress();
	
	EqualState[] eqStates = {new IncompleteEquals(), new CompleteEquals()};
	
	DecimalFormat calcFormat = new DecimalFormat("#.#############");
	
	Map<Boolean, PMState> pmMap = new HashMap<Boolean, PMState>();
	
	public CalcInternal() {
		pmMap.put(true, new HasDecPM());
		pmMap.put(false, new HasNumPM());
	}
	
	
	public String takeNum(int num) {
		
		press.setCurrent(this, ""+num);
		press = press.next();
		pm = pmMap.get(current.contains("."));
		eq = eqStates[op.equalsIndex()];
		
		return current;
	}
	
	public String takeOp(OpState operation) {
		op.operate(this);
		op = operation;
		pm = new NoNumPM();
		press = new FirstPress();
		dec = new noDec();
		return total;
	}
	
	public String equals() {
		
		eq.operate(this);
		eq = eq.next();
		return total;
	}
	
	public String dec() {
		press.setCurrent(this, "");
		press = press.next();
		current = dec.operate(current);
		dec = new hasDec();
		pm = pmMap.get(current.contains("."));
		return current;
	}
	
	public String PM() {
	
		
		
		current = pm.operate(current);
		press = press.next();
		pm = pm.next();
		return current;
	}
	
	public void clear() {
		current = "0";
		total = "0";
		op = new NoOp();
		dec = new noDec();
		pm = new NoNumPM();
		eq = new IncompleteEquals();
		press = new FirstPress();
	}
	
	
	

	
	
	public String getCurrent() {
		return current;
	}
	
	public String getTotal() {
		return total;
	}
	
	public OpState getOp() {
		return op;
	}
	
	public void setCurrent(String current) {
		this.current  = current;
	}
	
	public void setTotal(String total) {
		this.total = total;
	}
	
		
	
}


