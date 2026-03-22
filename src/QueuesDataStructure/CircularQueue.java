package QueuesDataStructure;


class CircleQueue{
    int[] arr;
    int currSize,cap;
    int f , r;
    CircleQueue(int cap){
        currSize=0;
        this.cap = cap;
        arr = new int[cap];
        f=0;
        r=-1;
    }
    void push(int data){
        if (currSize==cap){
            System.out.println("Capacity full");
            return;
        }
        r= (r+1)%cap;
        arr[r]=data;
        currSize++;

    }
    void pop(){
        if (currSize == 0){
            System.out.println("CQ is Empty");
            return;
        }
        f = (f + 1) % cap;
        currSize--;
    }
    int front(){
        if (empty()){
            System.out.println("CQ is Empty");
            return -1;
        }
        return arr[f];
    }
    boolean empty(){
        return currSize==0;
    }
    void display(){
        if (currSize == 0){
            System.out.println("CQ is Empty");
            return;
        }

        int i = f;
        for (int count = 0; count < currSize; count++){
            System.out.print(arr[i] + " ");
            i = (i + 1) % cap;
        }
        System.out.println();
    }
}
public class CircularQueue {
    public static void main(String[] args) {
        CircleQueue cq = new CircleQueue(5);
        cq.push(5);
        cq.push(10);
        cq.push(15);

        cq.display();   // 5 10 15

        cq.pop();
        cq.display();   // 10 15
    }
}
