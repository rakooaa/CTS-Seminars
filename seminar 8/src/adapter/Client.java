package adapter;

public class Client {
	
	private String name;
	private int nrOrder;
	private int[] orders;
	
	public Client(String name, int nrOrder, int[] orders) {
		super();
		this.name = name;
		this.nrOrder = nrOrder;
		this.orders = orders;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNrOrder() {
		return nrOrder;
	}

	public void setNrOrder(int nrOrder) {
		this.nrOrder = nrOrder;
	}

	public int[] getOrders() {
		return orders;
	}

	public void setOrders(int[] orders) {
		this.orders = orders;
	}
	
	
	
}
