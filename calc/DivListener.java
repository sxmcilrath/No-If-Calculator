package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivListener implements ActionListener {

	CalculatorFace face;
	CalcInternal intern;
	
	public DivListener(CalculatorFace face, CalcInternal intern) {
		this.face = face;
		this.intern = intern;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		face.writeToScreen(intern.takeOp(new DivOp()));
	}

}
