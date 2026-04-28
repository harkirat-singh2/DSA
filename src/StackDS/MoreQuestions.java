package StackDS;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class MoreQuestions {

    static boolean sameStyle(char a, char b) {

        if (a == '[' && b == ']') return true;

        if (a == '{' && b == '}') return true;

        return a == '(' && b == ')';
    }

    static boolean isValid(String s){

        if (s.length()%2!=0) return false;

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='(' || ch=='[' || ch=='{') st.push(ch);
            else {
                if(st.isEmpty()) return false;
                char top = st.peek();
                if (sameStyle(top,ch)) st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }

    public String removeConsecutive(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.isEmpty())  st.push(ch);
            else {
                char top = st.peek();
                if (top != ch) st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }

    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.isEmpty())  st.push(ch);
            else {
                char top = st.peek();
                if (top == ch) st.pop();
                else st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }

    public int baseballGame(String[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

            if (s.equals("C")) {
                st.pop();
            } else if (s.equals("D")) {
                st.push(st.peek() * 2);
            } else if (s.equals("+")) {
                int top = st.pop();
                int secTop = st.peek();
                st.push(top);
                st.push(top + secTop);
            } else {
                st.push(Integer.parseInt(s));
            }
        }

        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }

    public ListNode removeNodes(ListNode head){
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;

        while (temp!=null){
            while (!st.isEmpty() && st.peek().val < temp.val) {

                st.pop();
            }
            st.push(temp);
            temp = temp.next;
        }
        ListNode newHead = null;

        while (!st.isEmpty()) {
            ListNode node = st.pop();
            node.next = newHead;
            newHead = node;
        }
        return newHead;
    }

    public ListNode reverseLL(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while (curr!=null){
            ListNode temp  = curr.next;
            curr.next=prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n= arr.length;
        int[] nge = new int[n];
        nge[n-1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for (int i = n-2; i >=0 ; i--) {
            while (!st.isEmpty() && arr[i]>=st.peek()) st.pop();
            if (st.isEmpty()) nge[i] = -1;
            else nge[i] = st.peek();
            st.push(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            ans.add(nge[i]);
        }
        return ans;
    }


//    public ListNode removeNodesByReverse(ListNode head){
//        head = reverseLL(head);
//        ListNode curr = head;
//        ListNode maxSoFar = head;
//
//        while (curr!=null){
//            if (curr.next.val < maxSoFar.val){
//
//                while (curr.next != null && curr.next.val < maxSoFar.val){
//                    curr.next = curr.next.next;
//                }
//            }
//            else{
//                maxSoFar.next = curr;
//                maxSoFar = maxSoFar.next;
//            }
//
//        }
//
//    }

    public static void main(String[] args) {

    }
}
