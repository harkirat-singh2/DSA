package LinkedList;

class Node{    // User Defined Data type
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Linkedlist{  // User Defined Data Structure
    Node head , tail;

    void  addAtTail(int val){
        Node temp = new Node(val);
        if (tail==null) head = tail = temp;
        tail.next= temp;
        tail = temp;
    }
     void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void addAtFront(){
        Node temp = new Node(90);
        if (tail==null) head = tail = temp;
        temp.next = head;
        head = temp;
    }
    void deleteAtFront(){
        if (tail==null) head = tail;
        head = head.next;
        if (head == null) tail=null;
    }

}
public class LLDataStruc {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.display();
        System.out.println();
        ll.addAtFront();
        ll.display();
        System.out.println();
        ll.deleteAtFront();
        ll.display();

    }
}
