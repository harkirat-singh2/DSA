package QueuesDataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueDS {
    static void addAtIndex(Queue<Integer> q , int idx , int el) throws Exception {

        if (idx < 0 || idx > q.size()) {
            throw new Exception("Invalid Index");
        }

        int n = q.size();

        // Step 1: rotate first idx elements
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }

        // Step 2: insert element
        q.add(el);

        // Step 3: rotate back remaining elements
        for (int i = 0; i < n - idx; i++) {
            q.add(q.remove());
        }
    }
    static int peek(Queue<Integer> q, int idx){
        int n = q.size();

        // step 1: bring idx element to front
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }

        // step 2: get element
        int x = q.peek();   // use peek instead of remove

        // step 3: restore queue
        for (int i = 0; i < n - idx; i++) {
            q.add(q.remove());
        }

        return x;
    }
    static void reverseQueue(Queue<Integer> q){
        int n = q.size();
        Stack<Integer> st  =  new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(q.remove());
        }
        for (int i = 0; i < n; i++) {
            q.add(st.pop());
        }
    }
    static void reverseQueueArrayList(Queue<Integer> q){
        int n = q.size();
        ArrayList<Integer> arr = new ArrayList<>();

        // Step 1: Move queue → arraylist
        for (int i = 0; i < n; i++) {
            arr.add(q.remove());
        }

        // Step 2: Add back in reverse
        for (int i = n - 1; i >= 0; i--) {
            q.add(arr.get(i));
        }
    }
    static void reverseKElQueue(Queue<Integer> q, int k){
        int n = q.size();

        if (k <= 0 || k > n) return;

        Stack<Integer> st = new Stack<>();

        // Step 1: push first k elements into stack
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        // Step 2: push back to queue (reversed)
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3: move remaining elements to back
        for (int i = 0; i < n - k; i++) {
            q.add(q.remove());
        }
    }

    static int findTheWinner(Queue<Integer> q, int n, int k){

        // keep removing until one left
        while (q.size() > 1) {

            // rotate k-1 times
            for (int i = 0; i < k - 1; i++) {
                q.add(q.remove());                //T.C -> k*n
            }

            // remove k-th person
            q.remove();
        }

        return q.peek(); // last remaining
    }
    static void display(Queue<Integer> q){
        int n = q.size();
        for (int i = 0; i < n; i++) {
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        System.out.println(findTheWinner(q,3,7));


    }
}


//2. Time Complexity Understanding (Important for interview)

//findTheWinner() → O(n × k)

//reverseQueue() → O(n)

//reverseKElQueue() → O(n)