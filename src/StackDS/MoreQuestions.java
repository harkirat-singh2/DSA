package StackDS;

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

    public int calPoints(String[] arr) {
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

    public static void main(String[] args) {

    }
}
