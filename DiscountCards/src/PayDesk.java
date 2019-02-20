import java.text.DecimalFormat;

public class PayDesk {

    public static void doPurchase(DiscountCard card, double purchaseValue) {
        DecimalFormat money = new DecimalFormat("$0.00");

        double discountValue = purchaseValue * card.getDiscountRate();
        double total = purchaseValue - discountValue;
        PayDesk.print(card, money.format(purchaseValue), money.format(discountValue), money.format(total));
    }

    private static void print(DiscountCard card, String purchaseValue, String discountValue, String total) {
        System.out.println("Purchase value: " + purchaseValue);
        System.out.println();
        System.out.println("Discount rate: " + formatDiscount(card));
        System.out.println();
        System.out.println("Discount: " + discountValue);
        System.out.println();
        System.out.println("Total: " + total);
        System.out.println();
        System.out.println("---------------------");
        System.out.println();
    }

    private static String formatDiscount(DiscountCard card) {
        DecimalFormat percent = new DecimalFormat("0.0%");
        return percent.format(card.getDiscountRate());
    }
}
