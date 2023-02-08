package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpListener implements ActionListener {

	private CalculatorFace face;
	private CalcInternal intern;
	String opType;
	
	public OpListener(CalculatorFace face, CalcInternal intern, String opType) {
		this.face = face;
		this.intern = intern;
		this.opType = opType;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		face.writeToScreen(opType);
	}

}
