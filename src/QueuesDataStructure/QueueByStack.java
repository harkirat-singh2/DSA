package QueuesDataStructure;

import java.util.Stack;
import java.util.Stack;

//  PUSH EFFICIENT APPROACH
class MyQueuePushEfficient {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        while (st.size() > 1) {
            helper.push(st.pop());
        }

        int el = st.pop();

        while (!helper.isEmpty()) {
            st.push(helper.pop());
        }

        return el;
    }

    public int peek() {
        while (st.size() > 1) {
            helper.push(st.pop());
        }

        int el = st.peek();

        while (!helper.isEmpty()) {
            st.push(helper.pop());
        }

        return el;
    }

    public boolean empty() {
        return st.isEmpty();
    }
}

class MyQueuePopEfficient{
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public void push(int x) {
        while (st.size() > 1) {
            helper.push(st.pop());
        }

        st.add(x);
        while (!helper.isEmpty()) {
            st.push(helper.pop());
        }
    }

    public int pop() {
        return st.pop();
    }

    public int peek() {
        return st.peek();
    }

    public boolean empty() {
        return st.isEmpty();
    }
}

public class QueueByStack {
    public static void main(String[] args) {

    }
}
