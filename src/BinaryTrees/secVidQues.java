package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

class Solutions {

    int levels(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    boolean isBalanced(Node root) {
        if (root == null) return true;
        if(Math.abs(levels(root.left)-levels(root.right))>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    static boolean flag;
    int  levelsOptimized(Node root){
        if (root==null) return 0;
        int leftLevels = levelsOptimized(root.left);
        int rightLevels = levelsOptimized(root.right);
        if(Math.abs(leftLevels-rightLevels)>1) flag =  false;
        return 1 + Math.max(leftLevels , rightLevels);
    }
    boolean isBalancedOptimized(Node root) {
        if (root == null) return true;
        flag = true;
        levelsOptimized(root);
        return flag;
    }

    int diameterbad(Node root){
        if (root==null) return 0;
        int a = levels(root.left) + levels(root.right);
        int b = diameterbad(root.left);
        int c = diameterbad(root.right);
        return  Math.max(a,Math.max(b,c));
    }

    static int max;
    int diameter(Node root){
        max = 0;
        levelsforDia(root);
        return  max;
    }
    int  levelsforDia(Node root){
        if (root==null) return 0;
        int leftLevels = levelsforDia(root.left);
        int rightLevels = levelsforDia(root.right);
        max = Math.max(max,leftLevels+rightLevels);
        return 1+ Math.max(leftLevels,rightLevels);
    }

    public List<Integer> rightSideView(Node root) {
        List<Integer> ans = new ArrayList<>();
        view(root,0,ans);
        return ans;
    }
    void view(Node root , int level , List<Integer> ans){
        if (root==null) return;
        if (level>=ans.size())ans.add(root.val);
        view(root.right,level+1,ans);
        view(root.left,level+1,ans);
    }


}

public class secVidQues {

    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null) return null;
        if (root == p || root == q) return root;
        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        return (left != null) ? left : right;
    }

//    int findDistance(Node root,int a ,int b){
//        if (root == null) return 0;
//        Node lca = lowestCommonAncestor(root, p, q) ;
//        int left = findDistance(root.left, a, b);
//        int right = findDistance(root.right, a, b);
//    }

   
    public static void main(String[] args) {

    }
}
