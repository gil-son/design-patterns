package ex01;

import java.util.Map;

interface Expression {
    int interpret(Map<String, Integer> context);
}
