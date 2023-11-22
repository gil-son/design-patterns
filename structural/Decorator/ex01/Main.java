package ex01;

public class Main {

    public static void main(String[] args) {

        // Creating a simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost of Simple Coffee: $" + simpleCoffee.cost());

        // Decorating the coffee with milk
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost of Milk Coffee: $" + milkCoffee.cost());

        // Decorating the coffee with sugar
        Coffee sweetCoffee = new SugarDecorator(simpleCoffee);
        System.out.println("Cost of Sweet Coffee: $" + sweetCoffee.cost());

        // Decorating the coffee with both milk and sugar
        Coffee sweetMilkCoffee = new SugarDecorator(new MilkDecorator(simpleCoffee));
        System.out.println("Cost of Sweet Milk Coffee: $" + sweetMilkCoffee.cost());

    }

}
