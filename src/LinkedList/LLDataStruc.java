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
    int search(int val){
        if (head == null) return -1;
        Node temp = head;
        int idx = 0;
        while (temp!=null){
            if (temp.val == val)return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    void insertAtIndex(int val,int idx){
        if (idx<0 || idx>size){
            System.out.println("Error");
            return;
        }
        if (idx ==0) addAtFront(val);
        else if (idx==size) addAtTail(val);
        else {
            Node temp = head;
            for (int i = 0; i < idx-1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

    }
    int get(int idx){
        if(idx < 0 || idx >= size) return -1;

        Node temp = head;

        for(int i = 1; i <= idx; i++){
            temp = temp.next;
        }

        return temp.val;
    }
    void deleteIndex(int index){
        if (index>0 || index>=size){
            System.out.println("Invalid Index");
            return;
        }
        if (index==0){
            deleteAtFront();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp= temp.next;
        }
        temp.next = temp.next.next;
        if (index==size-1) tail=temp;
        size--;
    }
}

public class LLDataStruc {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
//        ll.display();
//        System.out.println();
//        ll.addAtFront(60);
//        ll.display();
//        System.out.println();
//        ll.deleteAtFront();
//        System.out.println();
//        ll.display();
//        System.out.println(ll.size);
//        System.out.println();
//        System.out.println(ll.search(40));
//        ll.insertAtIndex(70,1);
//        System.out.println();
//        ll.display();
        System.out.println(ll.get(1));



    }
}
