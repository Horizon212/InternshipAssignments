public class BronzeCard extends DiscountCard {

    public BronzeCard(double turnover) {
        super(turnover);
    }

    @Override
    public double calculateDiscountRate(double turnover) {
        double rate = 0.0;

        if (turnover > 100 && turnover <= 300) {
            rate = 0.01;
        } else if (turnover > 300) {
            rate = 0.025;
        }
        return rate;
    }
}
