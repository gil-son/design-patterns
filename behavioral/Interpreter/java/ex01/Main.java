package ex01;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Define variables and their values
        Map<String, Integer> context = Map.of("x", 5, "y", 10);

        // Create expressions
        // x + y
        Expression expression = new AddExpression(
                        new VariableExpression("y"),
                        new VariableExpression("x")
        );

        // Interpret and evaluate the expression
        int result = expression.interpret(context);

        // Output the result
        System.out.println("Result 01: " + result);

        // x + (x - y)
        Expression expression02 = new AddExpression(
            new VariableExpression("x"),
            new SubtractExpression(
                new VariableExpression("y"),
                new VariableExpression("x")
            )
        );

        int result02 = expression02.interpret(context);
        System.out.println("Result 02: " + result02);

    }
}
