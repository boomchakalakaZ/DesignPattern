/*
 * 	11/30/2018
 * 	Purpose is to learn to implement from class diagram with patterns.
 */

package Iteration2;

public class EventRegistrationController {
	public EventRegistrationController() {
		//System.out.println("ERC");
	}
	
	public String filterEvents(String selected) {
		String eventList = null;
		
		if(selected == "ALL") {
			eventList = "List of event here";
		}
		
		
		return eventList;
	}
	
	public String registerEvent() {
		String regEvent = null;
		
		return regEvent;
	}
	
	public String saveRegister() {
		ConcreteEvent CEcommand = new ConcreteEvent();
		SaveInterface saveSRC = new SaveRegistrationConcrete();
		String saveReg = null;
		
		//Calling ConcreteEvent(command) and passing in object saveSRC to call save() 
		//	in class SaveEvaluationConcrete of the bridge pattern
		CEcommand.save(saveSRC);
		
		return saveReg;
	}

}
