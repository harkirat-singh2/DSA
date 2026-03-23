package QueuesDataStructure;

import java.util.LinkedList;
import java.util.Queue;

import java.util.*;

class MyStackPushEfficient {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        q.add(x);
    }

    int pop() {
        int n = q.size();

        for (int i = 0; i < n - 1; i++) {
            q.add(q.remove());
        }

        return q.remove();
    }

    int peek() {
        int n = q.size();

        for (int i = 0; i < n - 1; i++) {
            q.add(q.remove());
        }

        int x = q.peek();
        q.add(q.remove());   // restore order

        return x;
    }

    boolean isEmpty() {
        return q.isEmpty();
    }
}

class MyStackPopEfficient{
    Queue<Integer> q = new LinkedList<>();


    void push(int x){
        q.add(x);
    }
    int pop(){
        int n = q.size();
        for (int i = 0; i < n; i++) {
            q.add(q.remove());
        }
        return q.remove();
    }
    int peek(){
        int n = q.size();
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
