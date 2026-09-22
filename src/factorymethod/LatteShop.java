package factorymethod;

public class LatteShop extends CoffeeShop {
    @Override
    protected Drink createDrink() {
        return new Latte();
    }
}
