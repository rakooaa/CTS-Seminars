package composite;

public class Main {

	public static void main(String[] args) throws Exception {
		Structure menu=new Structure("Menu1");
		Structure menuDrinks=new Structure("Drinks");
		Structure menuFood=new Structure("Food");
		
	
		menu.addNode(menuDrinks);
		menu.addNode(menuFood);
		
		Structure alcDrink=new Structure("Alcoholic");
		Structure nonAlcDrink=new Structure("Non-Alcoholic");
		
		menuDrinks.addNode(alcDrink);
		menuDrinks.addNode(nonAlcDrink);
		
		Leaf pizzaCarbonara=new Leaf("Pizza Carbonara", 25);
		menuFood.addNode(pizzaCarbonara);
		menuFood.addNode(new Leaf("Pizza Prosciusto", 24));
		
		System.out.println(menu.getInfo());
		System.out.println(menuDrinks.getInfo());
	}
	
}
