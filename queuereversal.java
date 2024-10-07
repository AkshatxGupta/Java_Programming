import java.util.*;

class queuereversal {
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        while ((!q.isEmpty())) {
            s.push(q.removee());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
    }
}
