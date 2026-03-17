package QUeuesDataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {
    static void addAtIndex(Queue<Integer> q , int idx ,int el){
        for (int i = 0; i < idx; i++) {
            q.remove();
            q.add(el);

        }
    }
    static void traversal(Queue<Integer> q){
        for (int i = 0; i < q.size(); i++) {
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        traversal(q);

    }
}
