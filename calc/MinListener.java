package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinListener implements ActionListener {

	private CalculatorFace face;
	
	public MinListener(CalculatorFace face) {
		this.face = face;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		face.writeToScreen("working");
	}

}
