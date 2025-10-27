from factories.pizza_factory import PizzaFactory

def order_pizza(pizza_type: str):
    print(f"\n--- Order received: {pizza_type.title()} ---")
    pizza = PizzaFactory.create_pizza(pizza_type)
    pizza.prepare()
    pizza.bake()
    pizza.box()
    print("--- Pizza ready! ✅ ---")