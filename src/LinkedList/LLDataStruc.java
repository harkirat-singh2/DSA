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
    int size;
    void addAtTail(int val){
        Node temp = new Node(val);

        if (tail == null){
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }

        size++;
    }  // T,C , A.S = O(1)
    void display(){
        if (head == null) return;
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void addAtFront(int val){
        Node temp = new Node(val);
        if (tail==null) head = tail = temp;
        temp.next = head;
        head = temp;
        size++;
    }
    void deleteAtFront(){
        if (head==null) return;
        head = head.next;
        if (head == null) tail=null;
        size--;
    }
    boolean search(int val){
        if (head == null) return false;
        Node temp = head;
        while (temp!=null){
            if (temp.val == val)return true;
            temp = temp.next;
        }
        return false;
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
        ll.addAtFront(60);
        ll.display();
        System.out.println();
        ll.deleteAtFront();
        ll.display();
        System.out.println(ll.size);
        System.out.println(ll.search(40));

    }
}
