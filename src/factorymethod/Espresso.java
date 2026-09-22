package factorymethod;

public class Espresso implements Drink {
    @Override
    public void serve() {
        System.out.println("Serving a strong, rich Espresso.");
    }
}
