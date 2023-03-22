package Leetcode.Trees;

public class Q543 {
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        maxDiameter(root);
        return ans;
    }

    private int maxDiameter(TreeNode root){
        if(root == null) return 0;

        int left = maxDiameter(root.left);
        int right = maxDiameter(root.right);

        ans = Math.max(ans, left+right);
        return 1 + Math.max(left,right);
    }
}
