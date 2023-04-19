package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecListener implements ActionListener {

	CalculatorFace face;
	CalcInternal intern;
	
	public DecListener(CalculatorFace face, CalcInternal intern) {
		this.face = face;
		this.intern = intern;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		face.writeToScreen(intern.dec());
		
		
	}

}
