package ex01;

import java.util.Map;

class VariableExpression implements Expression {
    private String variableName;

    public VariableExpression(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        if (context.containsKey(variableName)) {
            return context.get(variableName);
        }
        return 0; // Default value if the variable is not found
    }
}
