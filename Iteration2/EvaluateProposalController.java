/*
 * 	11/30/2018
 * 	Purpose is to learn to implement from class diagram with patterns.
 */

package Iteration2;

public class EvaluateProposalController {
	
	public EvaluateProposalController() {
		//System.out.println("EPC");
	}
	
	public String selectEvent(String selected) {
		String eventList = null;
		
		if(selected == "ALL") {
			eventList = "List of event here";
		}
		
		
		return eventList;
	}
	
	public String evalDetails() {
		String evalDet = null;
		
		return evalDet;
	}
	
	public String saveEval() {
		ConcreteEvent CEcommand = new ConcreteEvent();
		SaveInterface saveEPC = new SaveEvaluationConcrete();
		String eval = null;
		
		//Calling ConcreteEvent(command) and passing in object saveEPC to call save() 
		//	in class SaveEvaluationConcrete of the bridge pattern
		CEcommand.save(saveEPC);
		
		return eval;
	}

}
