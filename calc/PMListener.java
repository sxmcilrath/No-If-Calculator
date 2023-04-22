package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * listener for PM
 * @author Sam M
 *
 */
public class PMListener implements ActionListener {

	CalculatorFace face;
	CalcInternal intern;
	
	/**
	 * sets fields 
	 * @param face
	 * @param intern
	 */
	public PMListener(CalculatorFace face, CalcInternal intern) {
		this.face = face;
		this.intern = intern;
	}

	@Override
	/**
	 * writes to screen intern's PM method
	 */
	public void actionPerformed(ActionEvent e) {
		face.writeToScreen(intern.PM());
		
	}

}
