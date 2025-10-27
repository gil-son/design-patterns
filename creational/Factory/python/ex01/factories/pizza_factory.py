from models.margherita import MargheritaPizza
from models.pepperoni import PepperoniPizza
from models.veggie import VeggiePizza

class PizzaFactory:
    @staticmethod
    def create_pizza(pizza_type: str):
        pizza_type = pizza_type.lower()
        if pizza_type == "margherita":
            return MargheritaPizza()
        elif pizza_type == "pepperoni":
            return PepperoniPizza()
        elif pizza_type == "veggie":
            return VeggiePizza()
        else:
            raise ValueError(f"Unknown pizza type: {pizza_type}")