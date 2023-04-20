package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EqualsListener implements ActionListener {

	CalculatorFace face;
	CalcInternal intern;
	
	public EqualsListener(CalculatorFace face, CalcInternal intern) {
		this.face = face;
		this.intern = intern;
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		face.writeToScreen(intern.equals());
		
	}

}
