

public class Main {
    public static void main(String[] args) {

        BronzeCard bronze = new BronzeCard(0);
        PayDesk.doPurchase(bronze,150.00);

        SilverCard silver = new SilverCard(600);
        PayDesk.doPurchase(silver, 850.00);

        GoldCard gold = new GoldCard(1500);
        PayDesk.doPurchase(gold, 1300.00);
    }
}
