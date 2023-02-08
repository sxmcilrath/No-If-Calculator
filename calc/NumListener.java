package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NumListener implements ActionListener {

	private CalculatorFace face;
	private int num;
	private CalcInternal intern;
	
	public NumListener(CalculatorFace face, int num, CalcInternal intern) {
		this.face = face;
		this.num = num;
		this.intern = intern;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/* TODO 
		 * Need to have the first number add up any previous operations
		 * Need to print to the screen 
		 */
		
		if(intern.getFirst() != 0) {
			String newNum = intern.getFirst() + "" + num;
			face.writeToScreen(newNum);
			intern.setFirst(Integer.parseInt(newNum));
		}
		else {
			face.writeToScreen("" + num);
			intern.setFirst(num);
		}
		
	}

}
