package StackDS;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyStack{
    Node head;
    int length;

    int peek(){
        return head.val;
    }
    int pop(){
        head  = head.next;
        length--;
        return head.val;

    }
    void push(int el){
       Node temp = new Node(el);
       if (length==0) head=temp;
       else {
           temp.next = head;
           head = temp;
           length++;
       }
    }
    int siz(){
        return length;
    }
}
public class StackImplementLL {
    public static void main(String[] args) {
        MyStack st  = new MyStack();
    }
}
