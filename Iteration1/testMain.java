package Iteration1;

public class testMain {
	
	public static void main(String[] args) {
		DBMgr DBMGR = new DBMgr();
		Registration REG = new Registration(0.00f);
		
		System.out.println(DBMGR.saveEvent());
		System.out.println(DBMGR.saveRegistration());
		System.out.println(DBMGR.updateProposal());
		System.out.println(DBMGR.requestEvent());
		
		float fee = REG.getFee();
		System.out.println(fee);
		
		
	}

}
