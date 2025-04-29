from .strategies.credit_card_payment import CreditCardPayment
from .strategies.paypal_payment import PayPalPayment
from .strategies.bitcoin_payment import BitcoinPayment

class PaymentFactory:
    @staticmethod
    def create_payment(method: str, **kwargs):
        if method == "credit_card":
            return CreditCardPayment(card_number=kwargs.get("card_number"))
        elif method == "paypal":
            return PayPalPayment(email=kwargs.get("email"))
        elif method == "bitcoin":
            return BitcoinPayment(wallet_address=kwargs.get("wallet_address"))
        elif method == "paypal":
            return BitcoinPayment(paypal=kwargs.get("paypal"))
        else:
            raise ValueError(f"Unknown payment method: {method}")