package QueuesDataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Questions {
    public void rearrangeQueue(Queue<Integer> q) {
        Queue<Integer> p = new LinkedList<>();
        int n = q.size();
        for (int i = 0; i <n/2 ; i++) {
            p.add(q.remove());
        }
        for (int i = n/2; i <n ; i++) {
            q.add(p.remove());
            q.add(q.remove());
        }

    }

    public static void main(String[] args) {

    }
}
