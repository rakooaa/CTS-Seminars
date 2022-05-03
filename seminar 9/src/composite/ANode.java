package composite;

public abstract class ANode {

	public abstract String getName();
	public abstract float getPrice(); 	//aceasta structura este specifica frunzei
	
	public String getInfo() {	//returneaza toate frunzele?
		return this.getName()+" -> "+this.getPrice();
	}
	
	//urmatoarele metode nu sunt specifice frunzelor
	public void addNode(ANode elem) {
		throw new UnsupportedOperationException();
	}
	public void removeNode(ANode elem) throws Exception {
		throw new Exception();
	}
	
	public ANode getNode(int index) throws Exception {
		throw new Exception();
	}
}
