package QueuesDataStructure;

import java.util.LinkedList;
import java.util.Queue;

class MyStack{
    Queue<Integer> q = new LinkedList<>();
    int n = q.size();

    void push(int x){
        q.add(x);
    }
    int pop(){
        for (int i = 0; i < n; i++) {
            q.add(q.remove());
        }
        return q.remove();
    }
    int peek(){
        for (int i = 0; i < n; i++) {
            q.add(q.remove());
        }
        int x = q.peek();
        q.add(q.remove());
        return x;
    }
    boolean isEmpty(){
        return (q.isEmpty());
    }
}

public class StackByQueue {
    public static void main(String[] args) {

    }
}
