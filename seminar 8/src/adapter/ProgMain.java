package adapter;

public class ProgMain {

	public static void main(String[] args) {
		
		int v[] = new int[2];
		v[0] = 100;
		v[1] = 150;
		Client c = new Client("Radu", 2, v);
		IDiscountB discount = new AdapterB2A();
		discount.calculateDiscount(c);
		
	}

}
