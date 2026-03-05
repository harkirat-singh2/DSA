package LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class BasicsOFLinkedList {
    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        display(a);
    }
}
