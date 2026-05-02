package StackDS;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


class Pair{
    int val;
    int idx;
    Pair(int val , int idx){
        this.val = val;
        this.idx = idx;
    }
}


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

    public int[] nextGreaterElements(int[] arr) {
        int n= arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n-1; i >=0 ; i--) {
            st.push(arr[i]);
        }
        for (int i = n-1; i >=0 ; i--) {
            while (!st.isEmpty() && arr[i]>=st.peek()) st.pop();
            if (st.isEmpty()) nge[i] = -1;
            else nge[i] = st.peek();
            st.push(arr[i]);
        }
        return nge;
    }

//    public void pattern(int n){
//        int[] arr = new int[n];
//
//    }

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

    public  ArrayList<Integer> calculateSpanWithPair(int[] arr){
        int n= arr.length;
        int[] span = new int[n];
        Stack<Pair> st = new Stack<>();
        span[0] = 1;
        Pair p = new Pair(arr[0],0);
        st.push(p);
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && st.peek().val<arr[i]) st.pop();
            if (st.isEmpty()) span[i] = i+1;
            else{
                span[i] = i-st.peek().idx;
            }
            st.push(new Pair(arr[i],i));
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < span.length; i++) {
            ans.add(span[i]);
        }
        return ans;
    }

    public  ArrayList<Integer> calculateSpan(int[] arr){
        int n= arr.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();
        span[0] = 1;
        st.push(0);
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()]<arr[i]) st.pop();
            if (st.isEmpty()) span[i] = i+1;
            else{
                span[i] = i-st.peek();
            }
            st.push(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < span.length; i++) {
            ans.add(span[i]);
        }
        return ans;
    }

    public int celebrity(int[][] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        // Step 1: push all
        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        // Step 2: eliminate
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();

            if (arr[a][b] == 1) {
                // a knows b → a not celeb
                st.push(b);
            } else {
                // a does NOT know b → b not celeb
                st.push(a);
            }
        }

        // Step 3: potential celeb
        int celeb = st.pop();

        // Step 4: verify
        for (int i = 0; i < n; i++) {
            if (i != celeb && arr[i][celeb] == 0) return -1;
        }

        for (int j = 0; j < n; j++) {
            if (j != celeb && arr[celeb][j] == 1) return -1;
        }

        return celeb;
    }



        public int[] canSeePersonsCount(int[] heights) {
            int n = heights.length;
            int[] ans = new int[n];
            Stack<Integer> st = new Stack<>();

            // Iterate from right to left
            for (int i = n - 1; i >= 0; i--) {
                int count = 0;

                // While the stack isn't empty AND the current person is taller than the person on top of the stack
                while (!st.isEmpty() && heights[i] > st.peek()) {
                    st.pop(); // The current person blocks anyone to their left from seeing this shorter person
                    count++;  // The current person can see this shorter person
                }

                // If there is still someone on the stack, they must be taller than the current person.
                // The current person can see them, but no one behind them.
                if (!st.isEmpty()) {
                    count++;
                }

                ans[i] = count;

                // Push the current person onto the stack so people to their left can potentially see them
                st.push(heights[i]);
            }

            return ans;
        }


    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];

        nse[n-1] = n;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for (int i = n-2; i >=0 ; i--) {

            while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();

            if (st.isEmpty()) nse[i] = n;

            else nse[i] = st.peek();
            st.push(i);
        }

        while (!st.isEmpty()){
            st.pop();
        }
        int[] pse =  new int[n];
        pse[0] = -1;
        st.push(0);

        for (int i = 0; i < n; i++) {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
            if (st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }
        int maxArea = 0;
        for (int i = 1; i < n; i++) {
            int area = arr[i] * (nse[i]-pse[i]-1);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }

    public static void main(String[] args) {

    }
}
