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
        if (head==null){
            System.out.println("Empty Stack");
            return -1;
        }
        return head.val;
    }
    int pop(){
        if (head==null){
            System.out.println("Empty Stack");
            return -1;
        }
        else{
            int x = head.val;
            head = head.next;
            length--;
            return x;
        }
    }
    void push(int el){
       Node temp = new Node(el);
       if (length==0) head=temp;
       else {
           temp.next = head;
           head = temp;
       }
        length++;
    }
    int siz(){
        return length;
    }
    void print(){
       Node temp = head;
       while (temp!=null){
           System.out.print(temp.val+" ");
           temp = temp.next;
       }
    }
}
public class StackImplementLL {
    public static void main(String[] args) {
        MyStack st  = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.print();
        System.out.println();
        st.push(50);
        st.print();
        st.pop();

    }
}
