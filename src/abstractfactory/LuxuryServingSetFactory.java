package abstractfactory;

public class LuxuryServingSetFactory implements ServingSetFactory {
    public Cup createCup() {
        return new LuxuryCup();
    }

    public Lid createLid() {
        return new LuxuryLid();
    }

    public Receipt createReceipt() {
        return new LuxuryReceipt();
    }
}
