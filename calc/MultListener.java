package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultListener implements ActionListener {

	CalculatorFace face;
	CalcInternal intern;
	
	public MultListener(CalculatorFace face, CalcInternal intern) {
		this.face = face;
		this.intern = intern;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		face.writeToScreen(intern.takeOp(new MultOp()));
	}

}
