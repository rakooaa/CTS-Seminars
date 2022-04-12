package decorator;

public class DecoratorChickenPizza extends DecoratorPizza{

	@Override
	public void getIngredients() {
		
		super.getIngredients();
		System.out.println("+ chicken");
	}

	@Override
	public void calculateCost() {
		// TODO Auto-generated method stub
		super.calculateCost();
	}
	
}
