package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Listener for equals button
 * @author Sam M
 *
 */
public class EqualsListener implements ActionListener {

	CalculatorFace face;
	CalcInternal intern;
	
	/**
	 * consructor sets fields
	 * @param face
	 * @param intern
	 */
	public EqualsListener(CalculatorFace face, CalcInternal intern) {
		this.face = face;
		this.intern = intern;
	
	}

	@Override
	/*
	 * calls internal equals method
	 */
	public void actionPerformed(ActionEvent e) {
		face.writeToScreen(intern.equals());
		
	}

}
