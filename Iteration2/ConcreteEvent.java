/*
 * 	11/30/2018
 * 	Purpose is to learn to implement from class diagram with patterns.
 */

package Iteration2;

//command pattern
public class ConcreteEvent {
	
	
	
	public ConcreteEvent() {
		//System.out.print("CE");
	}
	
	public void cloneEvent() {
		
	}
	
	//obj is either SaveEventConcrete, SaveEvaluationConcrete, or SaveRegistrationConcrete
	public void save(SaveInterface obj) {
		obj.save(); //Calling save() in the bridge pattern concrete classes
	}
	
	//Return EVENT?
	public void getEvent() {
		
	}

}
