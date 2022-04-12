package adapter;

public class DiscountB implements IDiscountB{

	@Override
	public double calculateDiscount(Client client) {
//		if(client.getNrOrder() > 100) {
//			return 0.1;
//		}
//		if(client.getNrOrder() > 50 && client.getNrOrder() < 100) {
//			return 0.05;
//		}
//		return 0;
		
		System.out.println("method b");
		int total = 0;
		for(int i = 0; i < client.getNrOrder(); i++) {
			total+=client.getOrders()[i];
		}
		if(total>1000) {
			return 0.3;
		}
		if(total > 500 && total <= 1000) {
			return 0.2;
		}
		return 0;
		
		
	}

}
