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
		
		//if statement to decide whether or not to alter first or second number
		
		if(intern.getOpReady()) {
			
			//sets first number by taking number before and combining it with the string past the decimal			
			intern.setFirst(Double.parseDouble(((int)intern.getFirst()) + "." + intern.getPostDecFirst()));
			intern.setOpReady(true);
			
			if(intern.getSecond() != 0) {
				//checks to see if user has pressed decimal button
				if(intern.getDecReady()) {
					
					String newNum;
					newNum = (((int)intern.getSecond()) + "." + intern.getPostDecSecond()+ "" + num);
					
					intern.setPostDecSecond(((intern.getPostDecSecond())+ "" + num));
					face.writeToScreen(newNum);
				}
				else {
					String newNum = ((int)intern.getSecond()) + "" + num;
					face.writeToScreen(newNum);
					intern.setSecond(Double.parseDouble(newNum));
					
				}
			}
			else {
				if(intern.getPMCheck()) {
					num = -num;
					face.writeToScreen("" + num);
					intern.setSecond(num);
					intern.setPMCheck(false);
				}
				else {
					System.out.println(num);
					face.writeToScreen("" + num);
					intern.setSecond(num);
				}
			}
		
		}
		
		//first number in operation
		else {
			if(intern.getFirst() != 0) {
					//checks to see if user has pressed decimal button
					if(intern.getDecReady()) {
						
						String newNum;
					
						newNum = (((int)intern.getFirst()) + "." + (intern.getPostDecFirst())+ "" + num);
					
						intern.setPostDecFirst(((intern.getPostDecFirst())+ "" + num));
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
					if(intern.getPMCheck()) {
						num = -num;
						face.writeToScreen("" + num);
						intern.setFirst(num);
						intern.setPMCheck(false);
					}
					else {
						face.writeToScreen("" + num);
						intern.setFirst(num);
					}
				}
		
		}
		
		
	}

}
