package calc;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents the internals of the calculator
 * stores nums, operations, and booleans depending on the case
 * @author Samuel McIlrath
 */

/**
 * handles all the different states of the class
 * @author Samuel McIlrath
 *
 */
public class CalcInternal {
	
	String current = "0";	//represents the current number
	String total = "0";		//represents the running total
	
	OpState op = new NoOp();		//represents the operation state
	DecState dec = new noDec();		//represents the decimal state
	PMState pm = new NoNumPM();		//represents the PM state
	EqualState eq = new IncompleteEquals();		//represents the equals state
	PressState press = new FirstPress();		//represents the press state
	
	EqualState[] eqStates = {new IncompleteEquals(), new CompleteEquals()};	//array of equals states
	
	DecimalFormat calcFormat = new DecimalFormat("#.#############");	//helps with decimal formatting
	
	Map<Boolean, PMState> pmMap = new HashMap<Boolean, PMState>();	//Map to switch PM states
	
	/**
	 * constructor to fill pmMap
	 */
	public CalcInternal() {
		pmMap.put(true, new HasDecPM());
		pmMap.put(false, new HasNumPM());
	}
	
	/**
	 * takes a number input 	
	 * @param num	user input
	 * @return		print to screen
	 */
	public String takeNum(int num) {
		
		press.setCurrent(this, ""+num);	//sets current based on press state
		press = press.next();			//change state
		pm = pmMap.get(current.contains("."));	//change pm state with map 
		eq = eqStates[op.equalsIndex()];	//change eq state with array
		
		return current;
	}
	
	/**
	 * Takes operation and acts accordingly
	 * 
	 * @param operation		the operation state
	 * @return 		total of operation
	 */
	public String takeOp(OpState operation) {
		
		op.operate(this); 	//call current op state
		op = operation;		//set op to the input operation
		
		//update other states
		pm = new NoNumPM();	
		press = new FirstPress();
		dec = new noDec();
		return total;
	}
	
	/**
	 * handles equals press
	 * @return	returns operation total
	 */
	public String equals() {
		
		eq.operate(this);	//operate with given op
		return total;
	}
	
	/**
	 * handles a decimal press
	 * 
	 * @return	returns the altered current number 
	 */
	public String dec() {
		
		press.setCurrent(this, "");	//set current num
		press = press.next();
		
		current = dec.operate(current);	//alter current with dec state context
		
		//change states
		dec = new hasDec();
		pm = pmMap.get(current.contains("."));
		return current;
	}
	
	/**
	 * handles PM press
	 * @return 	returns altered current
	 */
	public String PM() {
	
		current = pm.operate(current);	//changes current based on pm state
		
		//update states
		press = press.next();
		pm = pm.next();
		return current;
	}
	
	/**
	 * handles clear press
	 * just resets all states
	 */
	public void clear() {
		current = "0";
		total = "0";
		op = new NoOp();
		dec = new noDec();
		pm = new NoNumPM();
		eq = new IncompleteEquals();
		press = new FirstPress();
	}
	
	
	

	
	/**
	 * getter for current
	 * @return	current 
	 */
	public String getCurrent() {
		return current;
	}
	
	/**
	 * getter for total
	 * @return	total 
	 */
	public String getTotal() {
		return total;
	}
	
	/**
	 * getter for current operation
	 * @return	operation state
	 */
	public OpState getOp() {
		return op;
	}
	
	/**
	 * setter for current
	 * @param current		new current 
	 */
	public void setCurrent(String current) {
		this.current  = current;
	}
	
	/**
	 * setter for total
	 * @param total			new total
	 */
	public void setTotal(String total) {
		this.total = total;
	}
	
		
	
}


