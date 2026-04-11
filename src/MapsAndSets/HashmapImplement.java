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

class Questions{
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
            // updating elements
                map.put(front.dist, front.node.val);

            if (front.node.left != null) {
                q.add(new Pair(front.node.left, front.dist - 1));
            }
            if (front.node.right != null) {
                q.add(new Pair(front.node.right, front.dist + 1));
            }
        }
        // fill answer from sorted map+
        for (int val : map.values()) {
            ans.add(val);
        }
        return ans;
    }
    public static void levelOrderTraversalBFS(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode current = q.remove();
            System.out.println(current.val);

            if (current.left != null) q.add(current.left);
            if (current.right != null) q.add(current.right);
        }
    }
    public int amountOfTime(TreeNode root, int start) {
        if (root == null) return 0;

        // 🔹 Step 1: Build parent map + find start node
        HashMap<TreeNode, TreeNode> parent = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        TreeNode startNode = null;

        // Standard BFS traversal
        while (!q.isEmpty()) {
            TreeNode current = q.remove();

            // 🎯 Capture the start node
            if (current.val == start) {
                startNode = current;
            }

            // 🔗 Map left child → parent
            if (current.left != null) {
                parent.put(current.left, current);
                q.add(current.left);
            }

            // 🔗 Map right child → parent
            if (current.right != null) {
                parent.put(current.right, current);
                q.add(current.right);
            }
        }

        // 🔹 Step 2: BFS to simulate infection spread
        HashSet<TreeNode> visited = new HashSet<>();
        q.clear(); // reuse queue

        // Start infection from startNode
        q.add(startNode);
        visited.add(startNode);

        int time = 0;

        // 🔥 BFS level by level (each level = 1 minute)
        while (!q.isEmpty()) {
            int size = q.size();
            boolean spread = false; // track if infection spreads this minute

            for (int i = 0; i < size; i++) {
                TreeNode current = q.remove();

                // 🔥 Spread to LEFT child
                if (current.left != null && !visited.contains(current.left)) {
                    visited.add(current.left);
                    q.add(current.left);
                    spread = true;
                }

                // 🔥 Spread to RIGHT child
                if (current.right != null && !visited.contains(current.right)) {
                    visited.add(current.right);
                    q.add(current.right);
                    spread = true;
                }

                // 🔥 Spread to PARENT
                TreeNode p = parent.get(current);
                if (p != null && !visited.contains(p)) {
                    visited.add(p);
                    q.add(p);
                    spread = true;
                }
            }

            // ⏱️ Increase time only if infection spread
            if (spread) time++;
        }

        return time;
    }
    int maxDepth = 0;

    public int amountOfTimeAlter(TreeNode root, int start) {
        solve(root, start);
        return maxDepth;
    }

    public int solve(TreeNode root, int start)
    {
        int d = 0;

        if (root == null)
        {
            return d;
        }

        int l = solve(root.left, start);
        int r = solve(root.right, start);

        if (root.val == start)
        {
            maxDepth = Math.max(l, r);
            d = -1;
        }
        else if (l >= 0 && r >= 0)
        {
            d = Math.max(l, r) + 1;
        }
        else
        {
            maxDepth = Math.max(maxDepth, Math.abs(l) + Math.abs(r));
            d = Math.min(l, r) - 1;
        }

        return d;
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

    int majorityElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) > arr.length / 2) {
                return arr[i];  // majority found
            }
        }
        return -1; // if no majority element
    }

    int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue()); // descending

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i).getKey();
        }

        return res;
    }

    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());
        StringBuilder str = new StringBuilder();


        for (Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int freq = entry.getValue();

            for (int i = 0; i < freq; i++) {
                str.append(ch);
            }
        }
        return str.toString();
    }


    public static void main(String[] args) {
        HashmapImplement hmap = new HashmapImplement();
        String s = "aabbbcc";
        System.out.println(hmap.getMaxOccuringChar(s));

    }
}

