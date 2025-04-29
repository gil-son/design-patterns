from cart.shopping_cart import ShoppingCart
from payment.payment_factory import PaymentFactory

if __name__ == "__main__":
    cart = ShoppingCart()
    cart.add_item("Book", 29.99)
    cart.add_item("Pen", 2.50)

    # Instead of manually creating the strategy:
    payment = PaymentFactory.create_payment("credit_card", card_number="1234-5678-9876-5432")
    cart.set_payment_strategy(payment)
    cart.checkout()

    print("\nSwitching payment method...\n")
    payment = PaymentFactory.create_payment("bitcoin", wallet_address="1A2b3C4d5E6f7G8h9I0j")
    cart.set_payment_strategy(payment)
    cart.checkout()

    print("\nSwitching payment method...\n")
    payment = PaymentFactory.create_payment("paypal", email="email@domain.com")
    cart.set_payment_strategy(payment)
    cart.checkout()