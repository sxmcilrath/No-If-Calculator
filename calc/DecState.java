package calc;

public abstract class DecState<T> {

	abstract public String operate(String current);
	
	abstract public T alterNum(String temp);
	
}
