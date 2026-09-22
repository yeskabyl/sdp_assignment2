package abstractfactory;

public class KioskClient {
    private Cup cup;
    private Lid lid;
    private Receipt receipt;

    public KioskClient(ServingSetFactory factory) {
        this.cup = factory.createCup();
        this.lid = factory.createLid();
        this.receipt = factory.createReceipt();
    }

    public void serveOrder() {
        cup.assemble();
        lid.attach();
        receipt.print();
    }
}
