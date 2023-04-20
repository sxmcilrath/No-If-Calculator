package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Listener for decimals
 * @author Samuel McIlrath
 *
 */
public class DecListener implements ActionListener {

	CalculatorFace face;
	CalcInternal intern;
	
	/**
	 * set fields
	 * @param face
	 * @param intern
	 */
	public DecListener(CalculatorFace face, CalcInternal intern) {
		this.face = face;
		this.intern = intern;
	}

	@Override
	/**
	 * call decimal function in internal
	 */
	public void actionPerformed(ActionEvent e) {
		face.writeToScreen(intern.dec());
		
		
	}

}
