package abstractfactory;

public class EcoCup implements Cup {
    public void assemble() {
        System.out.println("Using recyclable cardboard cup.");
    }
}
