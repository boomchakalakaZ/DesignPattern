package Iteration1;

public class testMain {
	
	public static void main(String[] args) {
		DBMgr dbmgr = new DBMgr();
		String dbmgrTest;
		dbmgrTest = dbmgr.saveEvent();
		System.out.println(dbmgrTest);
		dbmgrTest = dbmgr.saveRegistration();
		System.out.println(dbmgrTest);
		dbmgrTest = dbmgr.updateProposal();
		System.out.println(dbmgrTest);
		dbmgrTest = dbmgr.requestEvent();
		System.out.println(dbmgrTest);
	}

}
