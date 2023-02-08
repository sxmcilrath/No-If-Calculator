package calc;

/**
 * SetUp
 * 
 * Class to set up and start the calculator, plus
 * facilities for test-driving the calculator.
 *
 * @author Thomas VanDrunen
 * CS 245, Wheaton College
 * June 27, 2014
*/
public class SetUp {

	/**
	 * Method for initializing the calculator internals and
	 * connecting them to the calculator face.
	 * @param face The component representing the user interface of 
	 * the calculator. 
	 */
	public static void setUpCalculator(CalculatorFace face) {

		// add code here that will have the effect of connecting
		// the given face to your calculator
		int num = 0;
		face.writeToScreen("hello");
		face.addActionListener('+', new PlusListener(face));
		face.addActionListener('-', new MinListener(face));
		face.addActionListener('*', new MultListener(face));
		face.addActionListener('/', new DivListener(face));
		face.addActionListener('C', new ClearListener(face));
		face.addNumberActionListener(num, new NumListener(face, num));
		
		
		
		
		
	}
	
	
	/**
	 * This main method is for your testing of your calculator.
	 * It will *not* be used during grading. Any changes you make
	 * to this method will be ignored at grading.
	 */
	public static void main(String[] args) {
		setUpCalculator(new PlainCalculatorFace());
	}

}
