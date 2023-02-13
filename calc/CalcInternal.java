package calc;

import java.text.DecimalFormat;

public class CalcInternal {

	private double first;
	private double second;
	private String postDecFirst;
	private String postDecSecond;
	private String operation;
	private String prevOp; //stores previous operation
	private double result;
	
	private boolean decReady;
	private boolean postDecReady; //boolean for post decimal number
	private boolean opReady; //boolean used to check if operation has been input
	private boolean decPressCheck; // checks used for if either first or second is a decimal
	private boolean equalPressCheck;//checks for equal button press
	private boolean pmCheck; //used to check for case where # is 0 but PM has been hit
	private boolean secCheck; //used to check whether or not the 2nd # has been input yet
	
	
	public CalcInternal() {
		// TODO Auto-generated constructor stub
		first = 0;
		second = 0; 
		operation = null;
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
	
	//Setters
	public void setFirst(double num ) {
		first = num;
		
	}
	
	public void setSecond(double num) {
		second = num;
		
	}
	
	public void setPostDecFirst (String temp) {
		postDecFirst = temp;
		
	}
	
	public void setPostDecSecond (String temp) {
		postDecSecond = temp;
		
	}
	
	public void setOperation(String op) {
		operation = op;
		
	}
	
	public void setPrevOp(String op) {
		prevOp = op;
	}
	
	public void setDecReady(boolean temp) {
		decReady = temp;
	}
	
	public void setPostDecReady(boolean temp) {
		postDecReady = temp;
	}
	
	public void setDecPressCheck(boolean temp) {
		decPressCheck = temp;
	}
	
	public void setOpReady(boolean temp) {
		opReady = temp;
	}
	
	public void setEqualPressCheck(boolean temp) {
		equalPressCheck = temp;
	}
	
	public void setPMCheck(boolean temp) {
		pmCheck = temp;
	}
	
	public void setSecCheck(boolean temp) {
		secCheck = temp;
	}
	
	
	
	//Getters
	public double getFirst() {
		return first;
	}
	
	public double getSecond() {
		return second;
	}
	
	public double getResult() {
		return result;
	}
	
	public String getPostDecFirst() {
		return postDecFirst;
		
	}
	
	public String getPostDecSecond() {
		return postDecSecond;
		
	}
	
	public String getOperation() {
		return operation;
	}
	
	public boolean getDecReady() {
		return decReady;
	}
	
	public boolean getPostDecReady() {
		return postDecReady;
	}
	
	public boolean getOpReady() {
		return opReady;
	}
	
	public boolean getDecPressCheck() {
		return decPressCheck;
	}
	
	public boolean getEqualPressCheck() {
		return equalPressCheck;
	}
	
	public boolean getPMCheck() {
		return pmCheck;
	}
	
	public boolean getSecCheck() {
		return secCheck;
	}
	
	public String getPrevOp() {
		return prevOp;
	}
	
	//Reset function to reset variables
	public void resetVar() {
		first = 0;
		second = 0;
		postDecFirst = "";
		postDecSecond = "";
		decReady = false;
		postDecReady = false;
		opReady = false;
		equalPressCheck = false;
		pmCheck = false;
		secCheck = false;
		
	}
	
	//loads up next operation and checks for other cases
	public void loadOperation(String op) {
		operation = op;
		opReady = true;
		decReady = false;
	}
	
	public double passOperation() {	
		//rounds decimals to take care of not needed zeros 
		DecimalFormat calcFormat = new DecimalFormat("#.#############");
		
		//addition 
		if(operation.equals("+")) {
			
			result = first + second;
			return result;
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
			result = first / second;
			return Double.parseDouble(calcFormat.format(result));
		}
		return 0;
		
	}
	
	

}
