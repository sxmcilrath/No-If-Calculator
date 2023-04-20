package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Listener for division
 * 
 * @author Sam M
 *
 */
public class DivListener implements ActionListener {

	CalculatorFace face;
	CalcInternal intern;
	
	/**
	 * set fields 
	 * 
	 * @param face
	 * @param intern
	 */
	public DivListener(CalculatorFace face, CalcInternal intern) {
		this.face = face;
		this.intern = intern;
	}

	@Override
	/**
	 * calls take op and passes the division op state
	 */
	public void actionPerformed(ActionEvent e) {
		face.writeToScreen(intern.takeOp(new DivOp()));
	}

}
