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
			
			//checks to see if user has pressed decimal button
			if(intern.getDecReady()) {
				
				String newNum;
				//workaround if statements that might not be needed after switching postDec to string		
							//if(intern.getPostDecReady() == false) {
							//newNum = (((int)intern.getFirst()) + "." + num);
							//intern.setPostDecReady(true);
							//}
						//else{
					newNum = (((int)intern.getFirst()) + "." + (intern.getPostDec())+ "" + num);
						//}
				
				intern.setPostDec(((intern.getPostDec())+ "" + num));
				face.writeToScreen(newNum);
				//intern.setFirst(Double.parseDouble(newNum));
			}
			else {
				String newNum = ((int)intern.getFirst()) + "" + num;
				face.writeToScreen(newNum);
				intern.setFirst(Double.parseDouble(newNum));
				
			}
		}
		else {
			face.writeToScreen("" + num);
			intern.setFirst(num);
		}
		
	}

}
