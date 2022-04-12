package adapter;

public class AdapterB2A extends DiscountA implements IDiscountB{

	@Override
	public double calculateDiscount(Client client) {
//		this.calculateDiscount(client.getNrOrder());
//		return 0;
		
		//v2
		System.out.println("method b");
		int total = 0;
		for(int i = 0; i < client.getNrOrder(); i++) {
			total += client.getNrOrder();
		}
		this.calculateDiscount(total);
		
		return 0;
	}
	
	
}
