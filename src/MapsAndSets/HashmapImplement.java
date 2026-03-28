package MapsAndSets;

import java.util.HashMap;

public class HashmapImplement {

    public char getMaxOccuringChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
//                int freq = map.get(ch);
//                map.put(ch,freq+1);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            else map.put(ch,1);
        }
        int maxFreq=0;
        char resultChar='z';
        for (char ch : map.keySet()) {
            int freq = map.get(ch);

            if (freq > maxFreq) {
                maxFreq = freq;
                resultChar = ch;
            }
        }
        return resultChar;
    }

    boolean isSubsetApproach1(int[] a, int[] b) {
        HashMap<Integer, Integer> ma = new HashMap<>();
        HashMap<Integer, Integer> mb = new HashMap<>();

        for (int el : a) {
            ma.put(el, ma.getOrDefault(el, 0) + 1);
        }
        for (int el : b) {
            if (!ma.containsKey(el)) return false;
            mb.put(el, mb.getOrDefault(el, 0) + 1);
        }
        for (int el : mb.keySet()) {
            int bFreq = mb.get(el);
            int aFreq = ma.get(el);

            if (aFreq < bFreq) return false;
        }
        return true;
    }

    boolean isSubsetApproach2(int[] a, int[] b){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int el:a){
            map.put(el, map.getOrDefault(el,0)+1);
        }
        for(int el: b){
            if (!map.containsKey(el) || map.get(el)==0) return false;
            else map.put(el,map.get(el)-1);
        }
        return true;
    }

    int countKDifference(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        if (k == 0) {
            for (int el : map.keySet()) {
                int f = map.get(el);
                count += f * (f - 1) / 2;
            }
        }
        else {
            for (int el : map.keySet()) {
                if (map.containsKey(el + k)) {
                    count += map.get(el) * map.get(el + k);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        HashmapImplement hmap = new HashmapImplement();
        String s = "aabbbcc";
        System.out.println(hmap.getMaxOccuringChar(s));

    }
}
