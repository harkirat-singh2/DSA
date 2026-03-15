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
