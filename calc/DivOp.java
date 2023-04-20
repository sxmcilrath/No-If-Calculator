package calc;

public class DivOp extends OpState {

	@Override
	public String perform(double current, double total) {
		if(current == 0) {
			return 0+"";
		}
		return calcFormat.format(total / current);
		
	}
	
	public int equalsIndex() {
		return 1;
	}

}
