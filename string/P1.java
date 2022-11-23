import java.util.Stack;

public class P1 {
    // Parenthesis Checker
    // Input:
    // {([])}
    // Output:
    // true
    // Explanation:
    // { ( [ ] ) }. Same colored brackets can form
    // balaced pairs, with 0 number of
    // unbalanced bracket.

    static boolean ispar(String x) {
        // add your code here
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < x.length(); i++) {
            char curr = x.charAt(i);

            if (isOpening(curr)) {
                s.push(curr);
            } else {
                if (s.isEmpty()) {
                    return false;
                } else if (!isMatching(s.peek(), curr)) {
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }

    static boolean isOpening(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    static boolean isMatching(char a, char b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }

}
