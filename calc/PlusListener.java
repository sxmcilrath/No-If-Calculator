package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * listener for the plus button
 * @author Sam M
 *
 */
public class PlusListener implements ActionListener {

	CalculatorFace face;
	CalcInternal intern;
	
	/**
	 * sets fields 
	 * @param face
	 * @param intern
	 */
	public PlusListener(CalculatorFace face, CalcInternal intern) {
		this.face = face;
		this.intern = intern;
		
	}

	@Override
	/**
	 * writes to screen the output of calling takeOp and 
	 * passing the PlusOp state
	 */
	public void actionPerformed(ActionEvent e) {
		face.writeToScreen(intern.takeOp(new PlusOp()));
		
	}

}
