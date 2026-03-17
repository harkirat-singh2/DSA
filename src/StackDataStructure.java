import java.util.Stack;

public class StackDataStructure {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Khushi");
        st.push("Aryan");
        st.push("Raghav");
        st.push("Puneet");
        st.push("Muskan");
        st.push("Rohit");
        System.out.println(st);   //A.S -> O(n)
        
    }
}
