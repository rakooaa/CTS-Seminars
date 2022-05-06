package composite;

import java.util.ArrayList;

public class Structure extends ANode {

	private ArrayList<ANode> list=new ArrayList<ANode>();
	String nameStructure;
	
	
	public Structure(String nameStructure) {
		super();
		this.nameStructure = nameStructure;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.nameStructure;
	}
	
	//missing getPrice ->e specific frunzei
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();	//exceptia asta nu iti cere throw la antet, dar nu e asa important
	}
	
	
//pt astea am dat Override manual, ca nu erau abstracte
	@Override
	public String getInfo() {
		//return super.getInfo();
		String info="\n"+this.nameStructure+":";
		for(ANode node:list){
			info+="\n"+node.getInfo();	//problema?
		}
		return info;
	}
	
	@Override
	public void addNode(ANode elem) {
		//super.addNode(elem);
		list.add(elem);
	}

	@Override
	public void removeNode(ANode elem) throws Exception {
		//super.removeNode(elem);
		list.remove(elem);
	}

	@Override
	public ANode getNode(int index) throws Exception {
		//return super.getNode(index);
		return list.get(index);
	}

	
	
}
