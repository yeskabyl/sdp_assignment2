package factorymethod;

public class Americano implements Drink {
    @Override
    public void serve() {
        System.out.println("Serving a hot, diluted Americano.");
    }
}