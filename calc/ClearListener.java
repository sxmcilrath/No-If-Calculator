package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearListener implements ActionListener {

	private CalculatorFace face;
	
	public ClearListener(CalculatorFace face) {
		this.face = face;
		// TODO Auto-generated constructor stub
	}

	@Override
	
	//clears the screen
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		face.writeToScreen("");
	}

}
