package factorymethod;

public class Latte implements Drink {
    @Override
    public void serve() {
        System.out.println("Serving a smooth, milky Latte.");
    }
}
