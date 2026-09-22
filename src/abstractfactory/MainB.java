package abstractfactory;

public class MainB {
    public static void main(String[] args) {
        ServingSetFactory factory = new EcoServingSetFactory();

        KioskClient kiosk = new KioskClient(factory);
        kiosk.serveOrder();
    }
}
