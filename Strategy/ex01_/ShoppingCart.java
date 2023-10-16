public class ShoppingCart {

    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal(double originalPrice) {
        if (discountStrategy == null) {
            throw new IllegalStateException("Please set a discount strategy.");
        }
        return discountStrategy.applyDiscount(originalPrice);
    }

}
