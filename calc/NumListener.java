package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumListener implements ActionListener {

	private CalculatorFace face;
	private int num;
	public NumListener(CalculatorFace face, int num) {
		this.face = face;
		this.num = num;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		face.writeToScreen(" " + num);
	}

}
