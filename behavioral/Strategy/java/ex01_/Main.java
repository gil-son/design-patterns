public class Main {

    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart();

        cart.setDiscountStrategy(new NoDiscount());
        double originalPrice = 100.0;
        double totalPrice = cart.calculateTotal(originalPrice);
        System.out.println("Price total (Without discount): " + totalPrice);

        cart.setDiscountStrategy(new TenPercentDiscount());
        totalPrice = cart.calculateTotal(originalPrice);
        System.out.println("Price total (With 10% of discount): " + totalPrice);

        cart.setDiscountStrategy(new TwentyPercentDiscount());
        totalPrice = cart.calculateTotal(originalPrice);
        System.out.println("Price total (With 20% of discount): " + totalPrice);
    }

}
