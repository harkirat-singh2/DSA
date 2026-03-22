package QueuesDataStructure;

import java.util.Scanner;

class CircQueue {
    int[] arr;
    int f = 0, r = 0, size = 0;

    CircQueue(int cap) {
        arr = new int[cap];
    }

    void add(int val) throws Exception {
        if (size == arr.length) throw new Exception("Queue is full");

        arr[r] = val;
        r = (r + 1) % arr.length;
        size++;
    }

    int remove() throws Exception {
        if (size == 0) throw new Exception("Queue is empty");

        int frontVal = arr[f];
        f = (f + 1) % arr.length;
        size--;

        return frontVal;
    }

    int peek() throws Exception {
        if (size == 0) throw new Exception("Queue is empty");
        return arr[f];
    }

    void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        int i = f;

        for (int count = 0; count < size; count++) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % arr.length;   // 🔁 circular movement
        }

        System.out.println();
    }
}

public class QueueArray {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CircQueue q = new CircQueue(n);
        q.add(50);
        q.add(30);
        q.add(20);
        q.add(40);
        q.add(10);
        q.remove();

    }
}
