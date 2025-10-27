from .abstract_base_pizza import Pizza

class VeggiePizza(Pizza):
    def prepare(self):
        print("Preparing Veggie: tomato sauce, mozzarella, bell peppers, olives.")

    def bake(self):
        print("Baking Veggie at 220°C for 11 minutes.")

    def box(self):
        print("Boxing Veggie Pizza")
