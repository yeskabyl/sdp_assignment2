package factorymethod;

public class EspressoShop extends CoffeeShop {
    @Override
    protected Drink createDrink() {
        return new Espresso(); }
}
