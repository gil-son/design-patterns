from .abstract_base_pizza import Pizza

class MargheritaPizza(Pizza):
    def prepare(self):
        print("Preparing Margherita: tomato sauce, mozzarella, basil.")

    def bake(self):
        print("Baking Margherita at 220°C for 10 minutes.")

    def box(self):
        print("Boxing Margherita Pizza")