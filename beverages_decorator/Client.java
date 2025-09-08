package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		
		Beverage coffee = new Cappuccino();
		System.out.println("Plain Cappuccino: " + coffee.cost());
		
		Beverage espresso = new Espresso();
		System.out.println("Plain Espresso: " + espresso.cost());
		
		Beverage chocolateCoffee = new Chocolate(new Cappuccino());
		System.out.println("Cappuccino with Chocolate: " + chocolateCoffee.cost());
		
		Beverage complexCoffee = new Whip(new Chocolate(new Milk(new Sugar(new Latte()))));
		System.out.println("Latte with Sugar, Milk, Chocolate, and Whip: " + complexCoffee.cost());
		
		Beverage espressoSpecial = new Whip(new Milk(new Espresso()));
		System.out.println("Espresso with Milk and Whip: " + espressoSpecial.cost());
		
		Beverage simpleCoffee = new Milk(new Sugar(new Cappuccino()));
		System.out.println("Cappuccino with Sugar and Milk: " + simpleCoffee.cost());

	}

}