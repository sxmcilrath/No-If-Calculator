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
		/*If an operation is pressed 
		 * 
		 */
		
		
		//implement PLUS MINUS button
		if (opType.equals("PM")) {
		
			
			//check to see if on first or second num
			if(intern.getOpReady() == false) {
				//checks if a number has been pressed
				if(intern.getFirst() == 0) {
					intern.setPMCheck(true);
					face.writeToScreen("-");
				}
				else {
					
				
					intern.setFirst(-intern.getFirst());
				
					//displays number with or without decimal based on situation
					if(intern.getDecReady()) {
						face.writeToScreen(((int)intern.getFirst()) + "." + intern.getPostDecFirst());
					}
					else {
						face.writeToScreen( ((int)intern.getFirst()) + "");
					}
				}
					
			}
			else {
				if(intern.getSecond() == 0) {
					intern.setPMCheck(true);
					face.writeToScreen("-");
				}
				else {
					
					intern.setSecond(-intern.getSecond());
				
					//displays number with or without decimal based on situation
					if(intern.getDecReady()) {
						face.writeToScreen(((int)intern.getSecond()) + "." + intern.getPostDecSecond());
					}
					else {
						face.writeToScreen( ((int)intern.getSecond()) + "");
					}
				}	
			}
				
			
		}
		
		//implement decimal button
		if (opType.equals(".")) {
			if(intern.getDecReady() == false) {
				
				if(intern.getOpReady()) { 
					face.writeToScreen((int)intern.getSecond()+"."); 
					}
				
				else {
					face.writeToScreen(((int)intern.getFirst())+".");
					}
				
				intern.setDecReady(true);
				intern.setDecPressCheck(true);
			}
			
			
		}
		
		//implement clear button
		if(opType.equals("C")) {
			intern.resetVar();
			face.writeToScreen("");
			
		}
		
		//implement plus button
		if(opType.equals("+")) {
			intern.loadOperation("+");
		}
		
		//implement subtract
		if(opType.equals("-")) {
			intern.loadOperation("-");
		}
		
		//implement multiplication
		if(opType.equals("*")) {
			intern.loadOperation("*");
		}
		
		//implement division
		if(opType.equals("/")) {
			intern.loadOperation("/");
		}
	
		
		//implements equals button
		if(opType.equals("=")) {
			//if operations have already been done then it will make the first number the 
			//result of the previous operation
			if(intern.getEqualPressCheck()) {
				intern.setFirst(intern.getResult());
			}
			
			if(intern.getOperation().equals("/")) {
				face.writeToScreen(intern.passOperation()+"");
			}
			
			else {
				if(intern.getDecPressCheck()) {
					intern.setSecond(Double.parseDouble(((int)intern.getSecond()) + "." + intern.getPostDecSecond()));
					face.writeToScreen(intern.passOperation()+"");
				}
				else {
					face.writeToScreen(((int)intern.passOperation())+"");
				}
			}
			//will print result based on whether or not decimal has been placed
			
		
			intern.setEqualPressCheck(true);
			
		}
	
	}

}
