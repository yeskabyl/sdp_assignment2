package factorymethod;

public class MainA {
    public static void main(String[] args) {
        CoffeeShop myShop = new LatteShop();
        myShop.orderDrink();
    }
}
