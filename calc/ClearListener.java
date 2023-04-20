package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * listener for the clear button
 * 
 * @author Samuel McIlrath
 *
 */
public class ClearListener implements ActionListener {

	//face and instance variables
	CalculatorFace face;
	CalcInternal intern;
	
	/**
	 * initialize fields
	 * 
	 * @param face
	 * @param intern
	 */
	public ClearListener(CalculatorFace face, CalcInternal intern) {
		this.face = face;
		this.intern = intern;
	}

	@Override
	/**
	 * call clear function
	 */
	public void actionPerformed(ActionEvent e) {																			
		intern.clear();
		face.writeToScreen("");
	}								

}
