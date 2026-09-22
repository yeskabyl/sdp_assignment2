package factorymethod;

public abstract class CoffeeShop {
    protected abstract Drink createDrink();

    public void orderDrink() {
        System.out.println("Processing new order...");
        Drink drink = createDrink();
        drink.serve();
        System.out.println("Order complete");
    }
}
