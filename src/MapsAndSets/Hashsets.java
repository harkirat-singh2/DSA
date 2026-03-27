package MapsAndSets;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashsets {

    int distinvt(int[] arr){
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < arr.length; i++) h.add(arr[i]);
        return h.size();
    }
    boolean  twoSum(int[] arr, int target){
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            int rem = target - arr[i];
            if (h.contains(rem)) return true;
            h.add(arr[i]);
        }
        return false;
    }

    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        HashSet<Integer> h = new HashSet<>();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            h.add(arr[i]);
        }
        for (int i = low; i <= high; i++) {
            if (!h.contains(i)) a.add(i);
        }
        return a;
    }

    public int findPairs(int[] arr, int k) {
        HashSet<Integer> h = new HashSet<>();
        int countPairs=0;
        for (int i = 0; i < arr.length; i++){
            h.add(arr[i]);
            int el = k + arr[i];
//            if (el) countPairs++;
        }
        return countPairs;
    }

    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();

    }
}
