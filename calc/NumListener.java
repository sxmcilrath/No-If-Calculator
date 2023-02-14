package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Listener class for numbers
 * @author Samuel McIlrath
 */
public class NumListener implements ActionListener {

	private CalculatorFace face;	//CalculatorFace object used to access display
	private int num;				//var to hold number pressed by user
	private CalcInternal intern;	//CalcInternal object to access internal state of calculator
	
	/**
	 * constructor 
	 * @param face		CalculatorFace object to interact with screen
	 * @param intern 	CalcInternal object to interact with calculator internals 
	 * @param num		number pressed by user
	 */
	NumListener(CalculatorFace face, int num, CalcInternal intern) {
		this.face = face;
		this.num = num;
		this.intern = intern;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		//resets internal if equal has been pressed and a new num is entered right after
		if(intern.getEqualPressCheck() && intern.getOperation().equals("none")) {
			intern.resetVar();
		}
		
		//if statement to decide whether or not to alter first or second number
		if(intern.getOpReady()) {
			
			//saving first number before moving onto second
			//sets first number by taking number before and combining it with the string past the decimal			
			intern.setFirst(Double.parseDouble(((int)intern.getFirst()) + "." + intern.getPostDecFirst()));
			intern.setOpReady(true);
			
			//check to see if this is the first number entered
			if(intern.getSecond() != 0) {
				
				//checks to see if user has pressed decimal button
				if(intern.getDecReady()) {
					
					String newNum = (((int)intern.getSecond()) + "." + intern.getPostDecSecond()+ "" + num);	//holds int value of what is on the left side of decimal and string of what's right
					intern.setPostDecSecond(((intern.getPostDecSecond())+ "" + num)); //updates right side of decimal
					face.writeToScreen(newNum);
				}
				//non decimal case
				else {
					String newNum = ((int)intern.getSecond()) + "" + num;
					face.writeToScreen(newNum);
					intern.setSecond(Double.parseDouble(newNum));
					
				}
			}
			else {
				if(intern.getPMCheck()) {
					if(intern.getDecReady()) {
						
						String newNum = ((-(int)intern.getSecond()) + "." + (intern.getPostDecSecond())+ "" + num);
						intern.setPostDecSecond(((intern.getPostDecSecond())+ "" + num));
						face.writeToScreen(newNum);
					}
					else {
						String newNum = ("" + -num);
						face.writeToScreen(newNum);
						intern.setSecond(Double.parseDouble(newNum));
						
					}
					
				}
				else {
					if(intern.getDecReady()) {
						
						String newNum = (((int)intern.getSecond()) + "." + (intern.getPostDecSecond())+ "" + num);
						intern.setPostDecSecond(((intern.getPostDecSecond())+ "" + num));
						face.writeToScreen(newNum);
					}
					else {
						String newNum = ("" + num);
						face.writeToScreen(newNum);
						intern.setSecond(Double.parseDouble(newNum));
						
					}
				}
				
			}
			
			intern.setSecCheck(true);	//lets calcinternal know that the second # has been modified
		}
		
		//first number in operation
		else {
			
			//checks will be the same for first and second number it just changes which num is modified
			//check if it's first num pressed
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
						if(intern.getDecReady()) {
							
							String newNum = ((-(int)intern.getFirst()) + "." + (intern.getPostDecFirst())+ "" + num);
							intern.setPostDecFirst(((intern.getPostDecFirst())+ "" + num));
							face.writeToScreen(newNum);
						}
						else {
							String newNum = ("" + -num);
							face.writeToScreen(newNum);
							intern.setFirst(Double.parseDouble(newNum));
							
						}
						
					}
					else {
						if(intern.getDecReady()) {
							
							String newNum = (((int)intern.getFirst()) + "." + (intern.getPostDecFirst())+ "" + num);
							intern.setPostDecFirst(((intern.getPostDecFirst())+ "" + num));
							face.writeToScreen(newNum);
						}
						else {
							String newNum = ("" + num);
							face.writeToScreen(newNum);
							intern.setFirst(Double.parseDouble(newNum));
							
						}
					}
				}
		
		}
		
		
	}

}
