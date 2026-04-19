package LinkedList;

public class MergingLL {

    public Node mergeTwoLists(Node listA, Node listB) {
        Node dummy = new Node(0);
        Node t = dummy;
        Node tempA = listA;
        Node tempB = listB;
        while (tempA!=null && tempB!=null){
            if (tempA.val <= tempB.val) {
                t.next = tempA;
                t = t.next;
                tempA = tempA.next;
            }
            else {
                t.next = tempB;
                t = t.next;
                tempB = tempB.next;
            }

        }
        if (tempA==null) t.next=tempB;
        else t.next=tempA;
        return dummy.next;
    }

    public Node sortList(Node head) {
        if (head == null || head.next == null) return head;
        Node slow = head;
        Node fast = head;
        while(fast.next!=null &&fast.next.next!=null){
            slow= slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        Node head1 = sortList(head);
        Node head3 = sortList(head2);
        return mergeTwoLists(head1,head3);
    }

    public static void main(String[] args) {

    }
}
