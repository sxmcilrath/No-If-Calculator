package calc;

public class CalcInternal {

	private double first;
	private double second;
	private String postDec;
	private String operation;
	private double result;
	private boolean decReady;
	private boolean postDecReady;
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
		postDec = "";
	}
	
	//Setters
	public void setFirst(double num ) {
		first = num;
		
	}
	
	public void setSecond(double num) {
		second = num;
		
	}
	
	public void setPostDec(String temp) {
		postDec = temp;
		
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
	
	//Getters
	public double getFirst() {
		return first;
	}
	
	public double getSecond() {
		return second;
	}
	
	public String getPostDec() {
		return postDec;
		
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
	
	//Reset function to reset variables
	public void resetVar() {
		first = 0;
		second = 0;
		postDec = "";
		decReady = false;
		postDecReady = false;
		
	}
	
	

}
