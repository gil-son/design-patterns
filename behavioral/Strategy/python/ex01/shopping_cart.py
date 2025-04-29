class ShoppingCart:
    def __init__(self):
        self.items = []
        self.payment_strategy = None

    def add_item(self, item: str, price: float):
        self.items.append((item, price))

    def set_payment_strategy(self, strategy):
        self.payment_strategy = strategy

    def checkout(self):
        if not self.payment_strategy:
            raise Exception("Payment strategy not set!")

        total = sum(price for _, price in self.items)
        print(f"Total amount: ${total:.2f}")
        self.payment_strategy.pay(total)