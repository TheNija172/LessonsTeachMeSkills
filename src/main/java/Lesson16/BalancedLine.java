package Lesson16;

import java.util.ArrayDeque;

public class BalancedLine {
    public static Boolean isBalanced(String line) {
        ArrayDeque<Character> parentheses = new ArrayDeque<>();
        String cleanedLine = line.replaceAll("[^()\\[\\]{}]", "");

        for (char symbol : cleanedLine.toCharArray()) {
            if (symbol == '(' || symbol == '[' || symbol == '{')
                parentheses.push(symbol);
            else {
                if (parentheses.isEmpty())
                    return false;
                if (!isMatching(parentheses.pop(), symbol))
                    return false;
            }
        }

        return true;
    }

    private static boolean isMatching(char open, char close) {
        return switch (open) {
            case '(' -> close == ')';
            case '[' -> close == ']';
            case '{' -> close == '}';
            default -> false;
        };
    }
}
