package LinkedList;


public class BasicsOFLinkedList {
    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayRec(Node head){
        Node temp = head;
        if (temp==null) return;
        System.out.print(temp.val+" ");
        displayRec(temp.next);

        System.out.println();
    }
    public static int get(Node head ,int idx){
        Node temp = head;
        for (int i = 0; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(9);
        Node e = new Node(8);
        a.next = b; b.next = c;
        c.next = d; d.next = e;
        System.out.println(get(a,2));
    }
}
