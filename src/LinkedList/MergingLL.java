package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

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

    public Node swapPairs(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = first.next;

            // Swap
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move prev forward
            prev = first;
        }

        return dummy.next;
    }

    public Node reverseListWithArrayList(Node head) {
        Node temp = head;
        ArrayList<Node> arr = new ArrayList<>();
       while (temp!=null){
           arr.add(temp);
           temp = temp.next;
       }
       int n = arr.size();
        for (int i = n-1; i >=1; i--) {
            arr.get(i).next = arr.get(i-1).next;
        }
        arr.get(0).next = null;
        return arr.get(n-1);
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode fwd = head;
        while (curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }

    public Node reverseListRecursion(Node head) {
        if (head == null || head.next == null) return head;

        Node newHead = reverseListRecursion(head.next);

        head.next.next = head; // reverse link
        head.next = null;      // break original link

        return newHead;
    }



    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null || fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode a =  reverseList(slow);

        ListNode b = head;
        while (a != null) {
            if (b.val != a.val) return false;
            b = b.next;
            a = a.next;

        }
        return true;
    }

    public int pairSum(ListNode head) {
        ListNode slow  = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }

        ListNode second =  reverseList(slow);
        ListNode first = head;
        int maxTwin = 0;
        while (second != null) {
            maxTwin = Math.max(maxTwin,first.val+ second.val);

            first = first.next;

            second = second.next;
        }
        return maxTwin;
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);

        ListNode o = odd;
        ListNode e = even;
        ListNode t = head;

        while (t != null) {
            // odd
            o.next = t;
            o = o.next;
            t = t.next;

            // even
            if (t != null) {
                e.next = t;
                e = e.next;
                t = t.next;
            }
        }

        // IMPORTANT: terminate even list
        e.next = null;

        // connect odd → even
        o.next = even.next;

        return odd.next;
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode c = dummy;
        ListNode a = head;
        ListNode b = head.next;

        while (a != null && b != null) {
            c.next = b;
            a.next = b.next;
            b.next = a;

            // move pointers
            c = a;
            a = a.next;

            if (a != null) b = a.next;
        }

        return dummy.next;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return ;
        ListNode slow  = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        ListNode second =  reverseList(slow.next);
        slow.next = null;
        ListNode first = head;
        while (second!=null){
            ListNode storeFirst = first.next;
            ListNode storeSecond = second.next;
            first.next = second;
            second.next =storeFirst;
            first= storeFirst;
           second = storeSecond;

        }
    }


//    public ListNode mergeKLists(ListNode[] lists) {
//        while (lists.length>1){
//        }
//    }

    public static void main(String[] args) {

    }
}
