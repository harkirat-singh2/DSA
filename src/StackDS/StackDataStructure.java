package StackDS;

import java.util.Stack;

public class StackDataStructure {
    public static void pushElRecAtBottom(Stack<String> st,String el){
        if (st.isEmpty()){
            st.push(el);
            return;
        }
        String top = st.pop();
        pushElRecAtBottom(st,el);
        st.push(top);
    }
    public static void revRec(Stack<String> st){
        if (st.isEmpty()){
            return;
        }
        String top = st.pop();
        revRec(st);
        st.push(top);
        pushElRecAtBottom(st,top);
    }
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Khushi");  //Bottom
        st.push("Aryan");
        st.push("Raghav");
        st.push("Puneet");
        st.push("Muskan");
        st.push("Rohit");   //Top
//        pushElRecAtBottom(st,"Priya");
        revRec(st);
        System.out.println(st);   //A.S -> O(n)

    }
}
