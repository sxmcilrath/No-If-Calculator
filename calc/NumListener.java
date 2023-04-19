package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Listener class for numbers
 * @author Samuel McIlrath
 */
public class NumListener implements ActionListener {

	private CalculatorFace face;	//CalculatorFace object used to access display
	private int num;				//var to hold number pressed by user
	private CalcInternal intern;	//CalcInternal object to access internal state of calculator
	
	/**
	 * constructor 
	 * @param face		CalculatorFace object to interact with screen
	 * @param intern 	CalcInternal object to interact with calculator internals 
	 * @param num		number pressed by user
	 */
	NumListener(CalculatorFace face, int num, CalcInternal intern) {
		this.face = face;
		this.num = num;
		this.intern = intern;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	face.writeToScreen(intern.takeNum(num));
		
		
	}

}
