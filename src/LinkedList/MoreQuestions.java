package LinkedList;

class Solution {
    public Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: find length and tail
        int n = 1;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        // Step 2: make it circular
        tail.next = head;

        // Step 3: find new tail
        k = k % n;
        int stepsToNewTail = n - k;

        Node newTail = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        // Step 4: break the circle
        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}

public class MoreQuestions {
    public Node deleteDuplicates(Node head) {
        Node curr =head;
        while(curr!=null && curr.next!=null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }
    public Node deleteDuplicatesAlter(Node head) {
        if (head == null) return null;
        Node i = head;       // last unique node
        Node j = head.next;  // scan pointer

        while (j != null) {
            if (i.val == j.val) {
                j = j.next;              // skip duplicates
            } else {
                i.next = j;              // link next unique
                i = j;                  // move i
                j = j.next;             // move j
            }
        }
        i.next = null; // cut off any leftover duplicates
        return head;
    }

    public Node deleteDuplicatesEntireVal(Node head) {
        Node dummy = new Node(0);
        Node t = dummy;
        Node i = head;
        while(i!=null){
            if (i.next == null ||i.val!=i.next.val){
                t.next=i;
                t =i;
                i = i.next;
                t.next = null;
            }
            else {
                Node j = i.next;
                while (j!=null &&j.val==i.val){
                    j= j.next;
                }
                i=j;
            }
        }
        t.next=i;
        return dummy.next;
    }
    

    public static void main(String[] args) {

    }
}
