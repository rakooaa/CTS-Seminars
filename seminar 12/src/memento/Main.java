package memento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerVersions caretaker=new ManagerVersions();	//handlerul - mementoul
		Contract originalContract=new Contract("Lar", "");
		
		originalContract.addClause("increase salary 14% ");	//noua verssiune - v1
		caretaker.addVersion(originalContract.saveVersion());
		System.out.println(originalContract);
		
		originalContract.addClause("note period changed");	//v2
		caretaker.addVersion(originalContract.saveVersion());
		
		originalContract.addClause("manager - note period changed");	//v3
		caretaker.addVersion(originalContract.saveVersion());
		
		originalContract.restoreFromVersion(caretaker.recoveryVersion(1));   //ne intoarecem la versiunea 2
		System.out.println(originalContract);
	}

}
