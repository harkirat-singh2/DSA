package LinkedList;

import java.util.Arrays;
import java.util.Collections;

public class MergingLL {

    public Node mergeTwoLists(Node listA, Node listB) {
        Node dummy = new Node(0);
        Node t = dummy;
        Node tempA = listA;
        Node tempB = listB;
        while (tempA!=null && tempB!=null){
            if (tempA.val <= tempB.val) {
                t.next = tempA;
                t = t.next;
                tempA = tempA.next;
            }
            else {
                t.next = tempB;
                t = t.next;
                tempB = tempB.next;
            }

        }
        if (tempA==null) t.next=tempB;
        else t.next=tempA;
        return dummy.next;
    }

    public Node sortList(Node head) {
        if (head == null || head.next == null) return head;
        Node slow = head;
        Node fast = head;
        while(fast.next!=null &&fast.next.next!=null){
            slow= slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        Node head1 = sortList(head);
        Node head3 = sortList(head2);
        return mergeTwoLists(head1,head3);
    }

//    public int firstMissingPositive(int[] arr) {
//        Arrays.sort(arr);
//        int low = 0;
//        int n= arr.length;
//        int high = n-1;
//        int mid = (low + high)/2;
//        int x;
//        while (low<high){
//
//    }
//}

    public Node partition(Node head, int x) {
        Node smallDummy = new Node(0);
        Node largeDummy = new Node(0);

        Node small = smallDummy;
        Node large = largeDummy;

        Node curr = head;

        while (curr!=null ){
            if (curr.val<x){
                small.next = curr;
                small = small.next;
            }
            else {
                large.next = curr;
                large = large.next;

            }
            curr = curr.next;
        }
        large.next = null;
        small.next = largeDummy.next;
        return  smallDummy.next;
    }

    public static Node partitionWithEqual(Node head, int x) {
        Node smallDummy = new Node(0);
        Node largeDummy = new Node(0);
        Node equalDummy = new Node(0);

        Node small = smallDummy;
        Node large = largeDummy;
        Node equal = equalDummy;


        Node curr = head;

        while (curr!=null ){
            if (curr.val<x){
                small.next = curr;
                small = small.next;
            }
            else if (curr.val==x) {
                equal.next = curr;
                equal = equal.next;

            } else {
                large.next = curr;
                large = large.next;

            }
            curr = curr.next;
        }
        large.next = null;
        equal.next = null;
        small.next = equalDummy.next;
        equal.next = largeDummy.next;
        return  smallDummy.next;
    }



    public static void main(String[] args) {

    }
}
