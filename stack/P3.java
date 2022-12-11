public class P3 {
    // sort a stack

    public Stack<Integer> sort(Stack<Integer> s) {
        if (s.isEmpty()) {
            return s;
        }
        int num = s.pop();
        sort(s);
        helper(s, num);
        return s;
    }

    public void helper(Stack<Integer> s, int num) {
        if (s.isEmpty() || s.peek() < num) {
            s.add(num);
            return;
        }
        int n = s.pop();
        helper(s, num);
        s.add(n);
    }
}
