package calc;

public class HasDecPM implements PMState {

	@Override
	public String operate(String current) {
		String beforeDec = current.substring(0, current.indexOf('.'));
		System.out.println(beforeDec);
		
		String afterDec = current.substring(current.indexOf('.'));
		System.out.println(afterDec);
		
		System.out.println((0 - Integer.parseInt(beforeDec)) + afterDec);
		return (0 - Integer.parseInt(beforeDec)) + afterDec;
	}

	@Override
	public PMState next() {
		// TODO Auto-generated method stub
		return this;
	}

}
