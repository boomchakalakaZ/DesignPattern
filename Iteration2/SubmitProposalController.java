/*
 * 	11/30/2018
 * 	Purpose is to learn to implement from class diagram with patterns.
 */

package Iteration2;

public class SubmitProposalController {
	
	public SubmitProposalController() {
		//System.out.println("SPC");
	}
	
	public String createEventProposal(String selected) {
		String eventList = null;
		
		return eventList;
	}
	
	public String saveEventProposal() {
		ConcreteEvent CEcommand = new ConcreteEvent();
		SaveInterface saveSPC = new SaveEventConcrete();
		String regEvent = null;
		
		//Calling ConcreteEvent(command) and passing in object saveSPC to call save() 
		//	in class SaveEvaluationConcrete of the bridge pattern
		CEcommand.save(saveSPC);
		
		return regEvent;
	}

}
