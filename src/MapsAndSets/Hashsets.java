package MapsAndSets;

import java.util.HashSet;

public class Hashsets {

    int distinvt(int[] arr){
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            h.add(arr[i]);
        }
        return h.size();
    }

    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();

    }
}
