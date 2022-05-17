package memento;

import java.util.ArrayList;

public class ManagerVersions {
	private ArrayList<ContractVersion> contractVersions = new ArrayList<>();
	
	
	public ArrayList<ContractVersion> getContract() {
		return contractVersions;
	}
	public void setContract(ArrayList<ContractVersion> contract) {
		this.contractVersions = contract;
	}


	public void addVersion(ContractVersion version) {
		this.contractVersions.add(version);
	}
	
	public ContractVersion recoveryVersion(int nrVersion)
	{
		return this.contractVersions.get(nrVersion);
	}
}
