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
			intern.setFirst(-intern.getFirst());
			
			//displays number with or without decimal based on situation
			if(intern.getDecReady()) {
				face.writeToScreen(""+ intern.getFirst());
			}
			else {
				face.writeToScreen( ((int)intern.getFirst()) + "");
			}
			
		}
		
		//implement decimal button
		if (opType.equals(".")) {
			intern.setDecReady(true);
			face.writeToScreen(intern.getFirst()+"");
			
		}
	
	}

}
