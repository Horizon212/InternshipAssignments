public class SilverCard extends DiscountCard {

    public SilverCard(double turnover) {
        super(turnover);
    }

    @Override
    public double calculateDiscountRate(double turnover) {
        double rate = 0.02;

        if (turnover > 300) {
            rate = 0.035;
        }
        return rate;
    }
}
