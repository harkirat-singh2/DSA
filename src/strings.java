import java.util.ArrayList;

public class strings {
    public static void change2(ArrayList<String> al){
        al.add("Nigga");
    }
    public static void main(String[] args) {
        String[] arr = {"a","b","c"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        ArrayList<String> al  = new ArrayList<>();
        al.add("umang");
        System.out.println(al);
        change2(al);
        System.out.println(al);
    }
}
