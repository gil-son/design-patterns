from ..interfaces.payment_strategy import PaymentStrategy

class PayPalPayment(PaymentStrategy):
    def __init__(self, email: str):
        self.email = email

    def pay(self, amount: float):
        print(f"Paying ${amount:.2f} using PayPal account {self.email}.")