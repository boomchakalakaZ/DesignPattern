/*
 * 	11/30/2018
 * 	Purpose is to learn to implement from class diagram with patterns.
 */
package Iteration2;

public class testMain2 {
	public static void main(String[] args) {
		
		EvaluateProposalController EPC = new EvaluateProposalController();
		EventRegistrationController ERC = new EventRegistrationController();
		SubmitProposalController SEC = new SubmitProposalController();
		
//		String selEvent = EPC.selectEvent("ALL");
//		
//		System.out.println("Printing list of events:: \n" + selEvent);
		
		EPC.saveEval();
		ERC.saveRegister();
		SEC.saveEventProposal();
		
	}

}
