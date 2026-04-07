package MapsAndSets;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
    }
}

class Pair{
    TreeNode node;
    int dist;

    Pair(TreeNode node, int dist){
        this.node = node;
        this.dist = dist;
    }
}

class View{
    public ArrayList<Integer> topView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        // HD → node value         For sorting HDs automatically
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair front = q.remove();
            // store first occurrence only
            if (!map.containsKey(front.dist)) {
                map.put(front.dist, front.node.val);
            }
            if (front.node.left != null) {
                q.add(new Pair(front.node.left, front.dist - 1));
            }
            if (front.node.right != null) {
                q.add(new Pair(front.node.right, front.dist + 1));
            }
        }
        // fill answer from sorted map
        for (int val : map.values()) {
            ans.add(val);
        }
        return ans;
    }
    public ArrayList<Integer> bottomView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        // HD → node value         For sorting HDs automatically
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair front = q.remove();
            // store first occurrence only
                map.put(front.dist, front.node.val);

            if (front.node.left != null) {
                q.add(new Pair(front.node.left, front.dist - 1));
            }
            if (front.node.right != null) {
                q.add(new Pair(front.node.right, front.dist + 1));
            }
        }
        // fill answer from sorted map
        for (int val : map.values()) {
            ans.add(val);
        }
        return ans;
    }
}

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

    public boolean isAnagram(String s, String t){
        HashMap<Character,Integer> map = new HashMap<>();
        if (s.length() != t.length()) return false;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++) {
            char ch = t.charAt(i);
            if (!map.containsKey(ch) || map.get(ch)==0) return false;
            map.put(ch,map.get(ch)-1);

        }
        return true;
    }

    int equalPairs(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int pairs = 0;
        for (char ch : map.keySet()){
            int freq = map.get(ch);
            pairs+= freq*freq;
        }
        return pairs;
    }

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            // remove until no duplicate
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        HashmapImplement hmap = new HashmapImplement();
        String s = "aabbbcc";
        System.out.println(hmap.getMaxOccuringChar(s));

    }
}
