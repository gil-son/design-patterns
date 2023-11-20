public class NoDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice;
    }
}
