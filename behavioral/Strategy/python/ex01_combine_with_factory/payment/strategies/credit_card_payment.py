from ..interfaces.payment_strategy import PaymentStrategy

class CreditCardPayment(PaymentStrategy):
    def __init__(self, card_number: str):
        self.card_number = card_number

    def pay(self, amount: float):
        print(f"Paying ${amount:.2f} using Credit Card {self.card_number}.")