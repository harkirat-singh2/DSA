package BST;


import com.sun.source.tree.Tree;
import org.w3c.dom.Node;

import java.util.ArrayList;

class TreeNode{
    TreeNode left, right;
    int val;
    TreeNode(int val){
        this.val = val;
    }
}

class Pair{
    int min , max;
    Pair(int min , int max){
        this.min = min;
        this.max = max;
    }
}

public class BinarySearchTrees {

    class Pair {
        int min;
        int max;

        Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    Pair minAndMaxBST(TreeNode root) {
        // Base case
        if (root == null) {
            return new Pair(Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        // Recursive calls
        Pair left = minAndMaxBST(root.left);
        Pair right = minAndMaxBST(root.right);

        // Compute min and max
        int min = Math.min(root.val, Math.min(left.min, right.min));
        int max = Math.max(root.val, Math.max(left.max, right.max));

        // Return result
        return new Pair(min, max);
    }

    boolean searchBST(TreeNode root , int target){
        if (root==null) return false;
        if (root.val == target) return true;
        return (root.val>target) ? searchBST(root.left,target) : searchBST(root.right,target);
    }

    int getCount(TreeNode root, int low, int high) {
        int count=0;
        if (root==null) return 0;
        if (root.val >= low && root.val <= high) count++;
        count+=getCount(root.left,low,high);
        count+=getCount(root.right,low,high);
        return count;
    }

    int rangeSumBST(TreeNode root, int low, int high) {
        int sum=0;
        if (root==null) return 0;
        if (root.val >= low && root.val <= high) sum+=root.val;
        sum+=rangeSumBST(root.left,low,high);
        sum+=rangeSumBST(root.right,low,high);
        return sum;
    }
    public TreeNode insertIntoBST(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }

        if (key < root.val) {
            root.left = insertIntoBST(root.left, key);
        } else if (key > root.val) {
            root.right = insertIntoBST(root.right, key);
        }

        return root;
    }

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return arr.get(k - 1);
    }

    void inorder(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }

    boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) >= arr.get(i + 1)) {
                return false;
            }
        }
        return true;

    }

     TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (p.val<root.val && q.val<root.val) return lowestCommonAncestor(root.left,p,q);
        if (p.val>root.val &&  q.val>root.val)return lowestCommonAncestor(root.right,p,q);
        return root;
    }
    int sum = 0;
    void revInorder(TreeNode root) {
        if (root == null) return;
        revInorder(root.right);
        sum+=root.val;
        root.val=sum;
        revInorder(root.left);
    }

    TreeNode convertBST(TreeNode root) {
        revInorder(root);
        return root;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(0);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(0);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        // Build tree
        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;
        BinarySearchTrees bt = new BinarySearchTrees();
        Pair result = bt.minAndMaxBST(a);
        System.out.println("Min: " + result.min);
        System.out.println("Max: " + result.max);
        System.out.println(bt.searchBST(a,7));

    }
}
