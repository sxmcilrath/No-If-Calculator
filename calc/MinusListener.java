package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Listener for minus symbol
 * @author Sam M
 *
 */
public class MinusListener implements ActionListener {

	CalculatorFace face;
	CalcInternal intern;
	
	/**
	 * constructor to set fields
	 * @param face
	 * @param intern
	 */
	public MinusListener(CalculatorFace face, CalcInternal intern) {
		this.face = face;
		this.intern = intern;
	}

	@Override
	/**
	 * calls the internal takeOp method and 
	 * passes it the minOp state
	 */
	public void actionPerformed(ActionEvent e) {
		face.writeToScreen(intern.takeOp(new MinOp()));
	}

}
