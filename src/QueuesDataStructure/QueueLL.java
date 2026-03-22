package QueuesDataStructure;

class Node{    // User Defined Data type
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class QueueLinkedList{
    Node head , tail;
    int size;
    void add(int val){
        Node temp = new Node(val);
        if (size==0){
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;

        }
        size++;
    }
    void remove(){
        if (head==null) return;
        head = head.next;
        if (head == null) tail=null;
        size--;
    }

    int get(int idx) {
        if (idx < 0 || idx >= size) return -1;

        Node temp = head;

        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }

        return temp.val;
    }
    void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class QueueLL {
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.add(50);
        q.add(20);
        q.add(20);
        q.add(20);
        q.add(20);
        q.display();

    }
}
