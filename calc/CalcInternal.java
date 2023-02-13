package calc;

import java.text.DecimalFormat;

/*
 * Represents the internals of the calculator
 * stores nums, operations, and booleans depending on the case
 */
public class CalcInternal {

	private double first;			//first num in operation
	private double second;			//second num in operation 
	private String postDecFirst;	//holds the val of what comes after the decimal for first
	private String postDecSecond;	//holds value for what comes after the decimal for second
	private String operation;		//holds operation
	private String prevOp; 			//stores previous operation
	private double result;			//stores result
	
	private boolean decReady;		//boolean for whether the target number is decimal
	private boolean postDecReady; 	//boolean for post decimal number
	private boolean opReady; 		//boolean used to check if operation has been input
	private boolean decPressCheck; 	// checks used for if either first or second is a decimal
	private boolean equalPressCheck;//checks for equal button press
	private boolean pmCheck; 		//used to check for case where # is 0 but PM has been hit
	private boolean secCheck; 		//used to check whether or not the 2nd # has been input yet
	
	
	public CalcInternal() {
		// assign values to variables
		first = 0;
		second = 0; 
		operation = "none";
		prevOp = "none";
		result = 0;
		decReady = false;
		postDecReady = false;
		opReady = false;
		decPressCheck = false;
		equalPressCheck = false;
		pmCheck = false;
		secCheck = false;
		postDecFirst = "";
		postDecSecond = "";
	}
	
	//SETTERS
	
	/**
	 * set first to num
	 * @param num  	value first is set to
	 * 
	 */
	public void setFirst(double num ) {
		first = num;
		
	}
	
	/**
	 * set second to num
	 * @param num  	value second is set to
	 * 
	 */
	public void setSecond(double num) {
		second = num;
		
	}
	
	/**
	 * set postDecFirst to temp
	 * @param temp	value postDecFirst is set to
	 * 
	 */
	public void setPostDecFirst (String temp) {
		postDecFirst = temp;
		
	}
	
	/**
	 * set postDecSecond to temp
	 * @param temp	value postDecSecond is set to
	 * 
	 */
	public void setPostDecSecond (String temp) {
		postDecSecond = temp;
		
	}
	
	/**
	 * set operation to op
	 * @param op	value operation is set to
	 * 
	 */
	public void setOperation(String op) {
		operation = op;
		
	}
	
	/**
	 * set prevOp to op
	 * @param op	value prevOp is set to
	 */
	public void setPrevOp(String op) {
		prevOp = op;
	}
	
	/**
	 * set decReady to temp
	 * @param temp	value decReady is set to
	 */
	public void setDecReady(boolean temp) {
		decReady = temp;
	}
	
	/**
	 * set postDecReady to temp
	 * @param temp	value postDecReady is set to
	 */
	public void setPostDecReady(boolean temp) {
		postDecReady = temp;
	}
	
	/**
	 * set decPressCheck to temp
	 * @param temp	value decPressCheck is set to
	 */
	public void setDecPressCheck(boolean temp) {
		decPressCheck = temp;
	}
	
	/**
	 * set opReady to temp
	 * @param temp	value opReady is set to
	 */
	public void setOpReady(boolean temp) {
		opReady = temp;
	}
	
	/**
	 * set equalPressCheck to temp
	 * @param temp	value equalPressCheck is set to
	 */
	public void setEqualPressCheck(boolean temp) {
		equalPressCheck = temp;
	}
	
	/**
	 * set pmCheck to temp
	 * @param temp	value pmCheck is set to
	 */
	public void setPMCheck(boolean temp) {
		pmCheck = temp;
	}
	
	/**
	 * set secCheck to temp
	 * @param temp	value secCheck is set to
	 */
	public void setSecCheck(boolean temp) {
		secCheck = temp;
	}
	
	
	
	//GETTERS
	
	/**
	 * @return val of first
	 */
	public double getFirst() {
		return first;
	}
	
	/**
	 * @return val of second
	 */
	public double getSecond() {
		return second;
	}
	
	/**
	 * @return val of result
	 */
	public double getResult() {
		return result;
	}
	
	/**
	 * @return val of postDecFirst
	 */
	public String getPostDecFirst() {
		return postDecFirst;
		
	}
	
	/**
	 * @return val of postDecSecond
	 */
	public String getPostDecSecond() {
		return postDecSecond;
		
	}
	
	/**
	 * @return val of operation
	 */
	public String getOperation() {
		return operation;
	}
	
	/**
	 * @return val of decReady
	 */
	public boolean getDecReady() {
		return decReady;
	}
	
	/**
	 * @return val of postDecReady
	 */
	public boolean getPostDecReady() {
		return postDecReady;
	}
	
	/**
	 * @return val of opReady
	 */
	public boolean getOpReady() {
		return opReady;
	}
	
	/**
	 * @return val of decPressCheck
	 */
	public boolean getDecPressCheck() {
		return decPressCheck;
	}
	
	/**
	 * @return val of equalPressCheck
	 */
	public boolean getEqualPressCheck() {
		return equalPressCheck;
	}
	
	/**
	 * @return val of pmCheck
	 */
	public boolean getPMCheck() {
		return pmCheck;
	}
	
	/**
	 * @return val of getSecCheck
	 */
	public boolean getSecCheck() {
		return secCheck;
	}
	
	/**
	 * @return val of prevOp
	 */
	public String getPrevOp() {
		return prevOp;
	}
	
	//Reset function to reset variables
	public void resetVar() {
		first = 0;
		second = 0;
		postDecFirst = "";
		postDecSecond = "";
		prevOp ="";
		operation = "";
		equalPressCheck = false;
		decReady = false;
		postDecReady = false;
		opReady = false;
		equalPressCheck = false;
		pmCheck = false;
		secCheck = false;
		
	}
	
	/**
	 * stores next operation and changes booleans
	 * @param op	operation being loaded
	 */
	public void loadOperation(String op) {
		operation = op;
		opReady = true;
		decReady = false;
	}
	
	/**
	 * calculates result of loaded operation with stored numbers
	 * @return result of given operation as a double
	 */
	public double passOperation() {	
		//rounds decimals to take care of not needed zeros 
		DecimalFormat calcFormat = new DecimalFormat("#.#############");
		
		
		//addition 
		if(operation.equals("+")) {
			
			result = first + second;
			return Double.parseDouble(calcFormat.format(result));
		}
		
		//subtraction
		if(operation.equals("-")) {
			
			result = first - second;
			return Double.parseDouble(calcFormat.format(result));
		}
		
		//multiplication
		if(operation.equals("*")) {
			result = first * second;
			return Double.parseDouble(calcFormat.format(result));
		}
		
		//division
		if(operation.equals("/")) {
			if(second == 0) {
				return 0;
			}
			result = first / second;
			return Double.parseDouble(calcFormat.format(result));
		}
		return 0;
		
	}
	
	

}
