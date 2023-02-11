package calc;

public class CalcInternal {

	private double first;
	private double second;
	private String postDecFirst;
	private String postDecSecond;
	private String operation;
	private double result;
	
	private boolean decReady;
	private boolean postDecReady; //boolean for post decimal number
	private boolean opReady; //boolean used to check if operation has been input
	private boolean decPressCheck; // checks used for if either first or second is a decimal
	private boolean ready;
	
	
	public CalcInternal() {
		// TODO Auto-generated constructor stub
		first = 0;
		second = 0; 
		operation = null;
		result = 0;
		decReady = false;
		ready = false;
		postDecReady = false;
		opReady = false;
		decPressCheck = false;
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
	
	//Getters
	public double getFirst() {
		return first;
	}
	
	public double getSecond() {
		return second;
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
	
	//Reset function to reset variables
	public void resetVar() {
		first = 0;
		second = 0;
		postDecFirst = "";
		postDecSecond = "";
		decReady = false;
		postDecReady = false;
		opReady = false;
		
	}
	
	//loads up next operation and checks for other cases
	public void loadOperation(String op) {
		operation = op;
		opReady = true;
		decReady = false;
	}
	
	public double passOperation() {	
		if(operation.equals("+")) {
			
			result = first + second;
			return result;
		}
		return 0;
		
	}
	
	

}
