from .abstract_base_pizza import Pizza

class PepperoniPizza(Pizza):
    def prepare(self):
        print("Preparing Pepperoni: tomato sauce, mozzarella, pepperoni.")

    def bake(self):
        print("Baking Pepperoni at 230°C for 12 minutes.")

    def box(self):
        print("Boxing Pepperoni Pizza")