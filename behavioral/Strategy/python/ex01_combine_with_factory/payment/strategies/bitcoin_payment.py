from ..interfaces.payment_strategy import PaymentStrategy

class BitcoinPayment(PaymentStrategy):
    def __init__(self, wallet_address: str):
        self.wallet_address = wallet_address

    def pay(self, amount: float):
        print(f"Paying ${amount:.2f} using Bitcoin wallet {self.wallet_address}.")