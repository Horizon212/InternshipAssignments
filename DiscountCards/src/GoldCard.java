public class GoldCard extends DiscountCard {

    public GoldCard(double turnover) {
        super(turnover);
    }

    @Override
    public double calculateDiscountRate(double turnover) {
        double rate = 0.02;

        if (turnover > 100 && turnover <= 200) {
            rate = 0.03;
        } else if (turnover > 200 && turnover <= 300) {
            rate = 0.04;
        } else if (turnover > 300 && turnover <= 400) {
            rate = 0.05;
        } else if (turnover > 400 && turnover <= 500) {
            rate = 0.06;
        } else if (turnover > 500 && turnover <= 600) {
            rate = 0.07;
        } else if (turnover > 600 && turnover <= 700) {
            rate = 0.08;
        } else if (turnover > 700 && turnover <= 800) {
            rate = 0.09;
        } else if (turnover > 800) {
            rate = 0.1;
        }
        return rate;
    }
}
