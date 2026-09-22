package factorymethod;

public class AmericanoShop extends CoffeeShop {
    @Override
    protected Drink createDrink() {
        return new Americano();
    }
}
