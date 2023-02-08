package calc;

public class CalcInternal {

	private int first;
	private int second;
	private String operation;
	private int result;
	private boolean ready;
	
	
	public CalcInternal() {
		// TODO Auto-generated constructor stub
		first = 0;
		second = 0; 
		operation = null;
		result = 0;
		ready = false;
	}
	
	//Setters
	public void setFirst(int num) {
		first = num;
		
	}
	
	public void setSecond(int num) {
		second = num;
		
	}
	
	public void setOperation(String op) {
		operation = op;
		
	}
	
	//Getters
	public int getFirst() {
		return first;
	}
	
	public int getSecond() {
		return second;
	}
	
	public String getOperation() {
		return operation;
	}
	
	
	

}
