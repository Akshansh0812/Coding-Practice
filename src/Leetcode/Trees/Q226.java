package Leetcode.Trees;

public class Q226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        return tree(root);

    }
    private TreeNode tree(TreeNode root){
        if(root == null) return null;
        TreeNode left = root.left, right = root.right;
        root.left = tree(right);
        root.right = tree(left);
        return root;
    }
}
