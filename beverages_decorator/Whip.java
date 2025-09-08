package beverages_decorator;

public class Whip extends BeverageDecorator {
    
    public Whip(Beverage beverage) {
        super(beverage);
    }
    
    @Override
    public int cost() {
        return beverage.cost() + 4;
    }
}