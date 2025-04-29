from payment.credit_card_payment import CreditCardPayment
from payment.bitcoin_payment import BitcoinPayment
from payment.paypal_payment import PayPalPayment
from shopping_cart import ShoppingCart

if __name__ == "__main__":
    cart = ShoppingCart()
    cart.add_item("Book", 29.99)
    cart.add_item("Pen", 2.50)

    cart.set_payment_strategy(CreditCardPayment(card_number="1234-5678-9876-5432"))
    cart.checkout()

    print("\nSwitching payment method...\n")
    cart.set_payment_strategy(BitcoinPayment(wallet_address="1A2b3C4d5E6f7G8h9I0j"))
    cart.checkout()

    print("\nSwitching payment method...\n")
    cart.set_payment_strategy(PayPalPayment(email="email@domain.com"))
    cart.checkout()