package adapter;

public class DiscountA implements IDiscountA{

	@Override
	public double calculateDiscount(int value) {
		
		
		System.out.println("method b");
		if(value > 100) {
			return 0.1;
		}
		if(value > 50 && value < 100) {
			return 0.05;
		}
		return 0;
	}

}
