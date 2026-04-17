package LinkedList;

class Practice{
    Node head , tail;
    int size;

    void deleteNode(Node target) {
        target.val = target.next.val;
        target.next = target.next.next;
    }
    void display() {
        if (head == null) return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    void addAtTail(int val){
        Node temp = new Node(val);

        if (tail == null){
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    Node middleNode(Node head) {
        int length = 0;
        Node temp  = head;
        while(temp !=null){
            temp = temp.next;
            length++;
        }
        temp =head;
        for(int i=1;i<=length/2;i++){
            temp = temp.next;
        }
        return temp;
    }

    Node middleNodeSlowAndFast(Node head){
        if (head == null || head.next == null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return head;
    }

    public Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy;
        Node slow = dummy;
        for (int i = 0; i<n;i++){
            fast = fast.next;
        }
        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public Node KthFromEnd(Node head, int n) {
        Node fast = head;
        Node slow = head;
        for (int i = 0; i<n;i++){
            if (fast==null) return null;
            fast = fast.next;
        }
        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return slow;
    }

    public Node oddEvenList(Node head) {
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even!=null && even.next!=null){
            odd.next = even.next;
            odd=odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;

        return  head;
    }

    public Node deleteMiddle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // delete middle
        prev.next = slow.next;

        return head;
    }

    public Node deleteMiddleFirst(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // delete middle
        prev.next = slow.next;

        return head;
    }

    public Node getIntersectionNode(Node headA, Node headB) {
        int lengthA = 0;
        int lengthB = 0;

        Node tempA = headA;
        Node tempB = headB;

        // Count length of A
        while (tempA != null) {
            tempA = tempA.next;
            lengthA++;
        }

        // Count length of B
        while (tempB != null) {
            tempB = tempB.next;
            lengthB++;
        }

        Node fastA = headA;
        Node fastB = headB;

        // Align both lists
        if (lengthA > lengthB) {
            int diff = lengthA - lengthB;
            for (int i = 0; i < diff; i++) {
                fastA = fastA.next;
            }
        } else {
            int diff = lengthB - lengthA;
            for (int i = 0; i < diff; i++) {
                fastB = fastB.next;
            }
        }

        // Move together
        while (fastA != fastB) {
            fastA = fastA.next;

            fastB = fastB.next;
        }

        return fastA; // intersection node or null
    }
}

public class Questions {
    public static void main(String[] args) {

        Practice ll = new Practice();

        ll.addAtTail(10);

        ll.addAtTail(20);

        ll.addAtTail(30);

        ll.addAtTail(40);

    }
}
