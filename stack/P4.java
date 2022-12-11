public class P4 {
    // special stack

    public void push(int a, Stack<Integer> s) {
        s.push(a);
    }

    public int pop(Stack<Integer> s) {
        return s.pop();
    }

    public int min(Stack<Integer> s) {
        int min = Integer.MAX_VALUE;
        for (int i : s) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public boolean isFull(Stack<Integer> s, int n) {
        return s.size() == n;
    }

    public boolean isEmpty(Stack<Integer> s) {
        return s.size() == 0;
    }
}
