package QueuesDataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Questions {
    public Queue<Integer> rearrangeQueueByQueue(Queue<Integer> q) {
        Queue<Integer> p = new LinkedList<>();
        int n = q.size();
        for (int i = 0; i <n/2 ; i++) {
            p.add(q.remove());
        }
        while (!p.isEmpty()) {
            q.add(p.remove());   // from first half
            q.add(q.remove());   // from second half
        }
        return q;
    }

    public Queue<Integer> rearrangeQueueByStack(Queue<Integer> q) {
        Stack<Integer> p = new Stack<>();
        int n = q.size();
        for (int i = 0; i <n/2 ; i++) {
            p.push(q.remove());
        }
        while (!p.isEmpty()){
            q.add(p.pop());
        }
        for (int i = 0; i <n/2 ; i++) {
            p.push(q.remove());
        }
        while (!p.isEmpty()){
            q.add(p.pop());
            q.add(q.remove());
        }
        while (!q.isEmpty()){
            p.push(q.remove());
        }
        while (!p.isEmpty()){
            q.add(p.pop());
        }
        return q;
    }

    public static void main(String[] args) {

    }
}
