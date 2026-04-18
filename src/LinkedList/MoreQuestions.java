package LinkedList;

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

        return head;
    }

    public static void main(String[] args) {

    }
}
