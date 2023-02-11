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
		System.out.println("This is the op ready check when # is pressed: " + intern.getOpReady());
		if(intern.getOpReady()) {
			
			//sets first number by taking number before and combining it with the string past the decimal
			/*
			 * CHANGE LATER!!!
			 * I'm setting a temp var to hold the first num, change the reset function later
			 * to better fit the situation 
			 */
			//double tempNum = (Double.parseDouble(((int)intern.getFirst()) + "." + intern.getPostDec()));
			//double tempNumSec = (Double.parseDouble(((int)intern.getSecond()) + "." + intern.getPostDec()));
			//intern.resetVar();
			//set First number
			intern.setFirst(Double.parseDouble(((int)intern.getFirst()) + "." + intern.getPostDecFirst()));
			//intern.setSecond(tempNum);
			intern.setOpReady(true);
			
			
			if(intern.getSecond() != 0) {
				System.out.println("This is to make sure we get past second check");
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
				face.writeToScreen("" + num);
				intern.setSecond(num);
			}
		
		}
		
		//first number in operation
		else {
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
						newNum = (((int)intern.getFirst()) + "." + (intern.getPostDecFirst())+ "" + num);
						//}
					
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
					face.writeToScreen("" + num);
					intern.setFirst(num);
				}
		
		}
		
		
	}

}
