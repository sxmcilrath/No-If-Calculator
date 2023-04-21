package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Listener for times button
 * @author Sam MS
 *
 */
public class MultListener implements ActionListener {

	CalculatorFace face;
	CalcInternal intern;
	
	/**
	 * constructor to set fields
	 * @param face
	 * @param intern
	 */
	public MultListener(CalculatorFace face, CalcInternal intern) {
		this.face = face;
		this.intern = intern;
		
	}

	@Override
	/**
	 * calls the internal takeOp method and passes it the 
	 * multOP state
	 */
	public void actionPerformed(ActionEvent e) {
		face.writeToScreen(intern.takeOp(new MultOp()));
	}

}
