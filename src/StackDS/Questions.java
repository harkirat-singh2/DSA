package StackDS;

import java.util.Stack;

public class Questions {
    static boolean isValid(String s) {

        // check odd length
        if (s.length() % 2 != 0) return false;

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // opening brackets
            if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            }
            else {
                // closing bracket but stack empty
                if (st.isEmpty()) return false;

                char top = st.peek();

                if (sameStyle(top, ch)) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    static boolean sameStyle(char a, char b) {
        if (a == '[' && b == ']') return true;
        if (a == '{' && b == '}') return true;
        return a == '(' && b == ')';
    }

    static String removeConsecutive(String s){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (st.isEmpty() || st.peek() != ch) {
                st.push(ch);
            }
        }

        // build result string
        StringBuilder result = new StringBuilder();

        for (char c : st) {
            result.append(c);
        }

        return result.toString();
    }
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (s.equals("C")) st.pop();
            else if (s.equals("D")) st.push(st.peek() * 2);
            else if (s.equals("+")) {
                int top = st.pop();
                int secTop = st.peek();
                int total = top + secTop;
                st.push(top);
                st.push(total);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
            int sum = 0;
            while (!st.isEmpty()){
                int top = st.pop();
                sum+=top;
            }
            return sum;
    }
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        System.out.println(removeConsecutive("cvjfvaabbfv"));


    }
}
