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

    public static void main(String[] args) {

    }
}
