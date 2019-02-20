abstract public class DiscountCard {
    private final double discountRate;

    public DiscountCard(double turnover) {
        this.discountRate = calculateDiscountRate(turnover);
    }

    abstract double calculateDiscountRate(double turnover);

    public double getDiscountRate() {
        return discountRate;
    }
}
