package composite;

public class Leaf extends ANode {
	String name;
	float price;
	
	public Leaf(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
	
}
