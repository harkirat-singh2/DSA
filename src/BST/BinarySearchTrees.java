package BST;


import com.sun.source.tree.Tree;

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
