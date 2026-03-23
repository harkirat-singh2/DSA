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
        while (!p.isEmpty()) {
            q.add(p.remove());   // from first half
            q.add(q.remove());   // from second half
        }

    }

    public static void main(String[] args) {

    }
}
