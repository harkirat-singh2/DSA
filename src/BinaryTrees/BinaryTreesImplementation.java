package BinaryTrees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int val;
    Node left , right;
    Node(int val){
        this.val = val;
    }
}
class Pair{
    Node node;
    int level;
    Pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}


class Solution{
    public boolean isSymmetric(Node root) {
        return(isMirror(root.left,root.right));
    }

    private boolean isMirror(Node a , Node b){
        if (a == null &&  b==null) return true;
        if (a == null ||  b==null) return false;
        if (a.val!=b.val) return false;
        return isMirror(a.left, b.right) &&  isMirror(a.right, b.left);
    }

//    public List<String> binaryTreePaths(Node root) {
//
//    }
//
//    public void binaryTreePaths(Node root,String path,List<String> s) {
//        if (root == null) return ;
//        if (root.left == null && root.right == null) return;
//        s.add(root+"->"+root.val);
//        binaryTreePaths(root)
//
//
//    }

}
public class BinaryTreesImplementation {

    static void displayPreorder(Node root){
        if (root==null) return;
        System.out.print(root.val+" ");
        displayPreorder(root.left);
        displayPreorder(root.right);
    }

    static void displayInorder(Node root){
        if (root==null) return;
        displayInorder(root.left);
        System.out.print(root.val+" ");
        displayInorder(root.right);
    }

    static void displayPostorder(Node root){
        if (root==null) return;
        displayPostorder(root.left);
        displayPostorder(root.right);
        System.out.print(root.val+" ");
    }

    static int size(Node root){
//        if (root==null) return 0;
//        return 1+ size(root.left) + size(root.right);
        return (root==null) ? 0 : (1+ size(root.left) + size(root.right));
    }

    static int sum(Node root){
        if (root==null) return 0;
        return root.val+ sum(root.left) + sum(root.right);
    }
    static int product(Node root){
        if (root==null) return 1;
        return root.val * product(root.left) * product(root.right);
    }
    static int productNonZeroes(Node root) {
        if (root == null) return 1;

        int left = productNonZeroes(root.left);
        int right = productNonZeroes(root.right);

        if (root.val == 0) return left * right;

        return root.val * left * right;
    }

    static int maxVal(Node root){
        if (root==null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(maxVal(root.left) , maxVal(root.right)));
    }
    static int level(Node root){
        if (root==null) return 0;
        return 1 + Math.max(level(root.left) , level(root.right));
    }

    public Node invertTree(Node root) {
        if (root == null) return null;

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public boolean isSameTree(Node p, Node q) {
        if (p == null &&  q==null) return true;
        if (p == null ||  q==null) return false;
        if (p.val!=q.val) return false;
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }

    public boolean hasPathSum(Node root, int targetSum) {
        if(root==null) return false;
        if(root.left==null && root.right==null){   // Going till leaf condition
            if(targetSum==root.val) return true;
            else return false;
        }
        return (hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val));
    }

    public boolean hasPathSumAlterMethod(Node root, int targetSum) {
        if (root == null) return false;

        targetSum -= root.val;

        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        return hasPathSumAlterMethod(root.left, targetSum) ||
                hasPathSumAlterMethod(root.right, targetSum);
    }

    public static void levelOrderTraversalBFS(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node current = q.remove();
            System.out.println(current.val);

            if (current.left != null) q.add(current.left);
            if (current.right != null) q.add(current.right);
        }
    }
    public static void levelOrderTraversalBFSLevelWise(Node root) {
        int currLevel = 0;
        if (root == null) return;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));

        while (!q.isEmpty()) {
            Pair front = q.remove();
            if (front.level!=currLevel){
                currLevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");

            if (front.node.left != null) q.add(new Pair(front.node.left,front.level+1));
            if (front.node.right != null) q.add(new Pair(front.node.right,front.level+1));
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(0);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(0);
        Node f = new Node(6);
        Node g = new Node(7);
        // Build tree
        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;
        displayPreorder(a);
        System.out.println(maxVal(a));

    }
}
