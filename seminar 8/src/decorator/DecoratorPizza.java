package decorator;

public abstract class DecoratorPizza extends APizza{
	
	protected APizza aPizza;
	@Override
	public void getIngredients() {
		// TODO Auto-generated method stub
		aPizza.getIngredients();
	}

	@Override
	public void calculateCost() {
		// TODO Auto-generated method stub
		aPizza.calculateCost();
	}
	
}
