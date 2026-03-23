package QueuesDataStructure;

import java.util.*;

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

    static List<Integer> firstNegIntBruteForce(int[] arr, int k) {
        List<Integer> l = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i <= n - k; i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (arr[i + j] < 0) {
                    l.add(arr[i + j]);   // first negative
                    found = true;
                    break;
                }
            }
            if (!found) {
                l.add(0);   // no negative in window
            }
        }
        return l;
    }
    static List<Integer> firstNegIntByQueue(int[] arr, int k) {
        List<Integer> l = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int n = arr.length;

        // Step 1: store all negative indices
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) q.add(i);
        }

        // Step 2: process each window
        for (int i = 0; i <= n - k; i++) {

            // remove indices out of window
            while (!q.isEmpty() && q.peek() < i) {
                q.remove();
            }

            // check if first negative is inside window
            if (!q.isEmpty() && q.peek() < i + k) {
                l.add(arr[q.peek()]);
            } else {
                l.add(0);
            }
        }

        return l;
    }

    public static void main(String[] args) {

    }
}
