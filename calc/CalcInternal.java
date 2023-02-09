package calc;

public class CalcInternal {

	private double first;
	private double second;
	private String operation;
	private double result;
	private boolean decReady;
	private boolean ready;
	
	
	public CalcInternal() {
		// TODO Auto-generated constructor stub
		first = 0;
		second = 0; 
		operation = null;
		result = 0;
		decReady = false;
		ready = false;
	}
	
	//Setters
	public void setFirst(double d) {
		first = d;
		
	}
	
	public void setSecond(double num) {
		second = num;
		
	}
	
	public void setOperation(String op) {
		operation = op;
		
	}
	
	public void setDecReady(boolean temp) {
		decReady = temp;
	}
	
	//Getters
	public double getFirst() {
		return first;
	}
	
	public double getSecond() {
		return second;
	}
	
	public String getOperation() {
		return operation;
	}
	
	public boolean getDecReady() {
		return decReady;
	}
	
	

}
